package com.ForoHub.Foro.controller;

import com.ForoHub.Foro.Topico.DtoTopico;
import com.ForoHub.Foro.Topico.DtoTopicoParaMostrar;
import com.ForoHub.Foro.Topico.RepositoryTopico;
import com.ForoHub.Foro.Topico.Topico;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private RepositoryTopico repositoryTopico;
@PostMapping
@Transactional
    public void guardarTopico(@RequestBody @Valid DtoTopico dtoTopico){

    Topico topico = new Topico(dtoTopico);
    // verifico que se haga la conversion correcta antes de guardar
    System.out.println(topico);
    //guardar en base de datos
        repositoryTopico.save(topico);
    }
//Listar los topicos
    @GetMapping
    public List<DtoTopicoParaMostrar> listarTopicos() {

        return repositoryTopico.findAll().stream()
                .map(DtoTopicoParaMostrar :: new).toList();
    }

    //borrar un registro Delete
    @DeleteMapping("/{id}")
    @Transactional
    public void deleteTopico(@PathVariable Long id){

    Topico topico = repositoryTopico.getReferenceById(id);
    repositoryTopico.delete(topico);

    }


}
