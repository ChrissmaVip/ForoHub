package com.ForoHub.Foro.Topico;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DtoTopicoParaMostrar(

     String titulo,
     String mensaje,
       String autor,
     String curso,
     LocalDateTime fechaDeCreacion,
     Boolean estadoDelTopico


) {

    public DtoTopicoParaMostrar(Topico topico){
        this( topico.getTitulo(), topico.getMensaje(), topico.getAutor(), topico.getCurso(), topico.getFechaDeCreacion(),topico.getEstadoDelTopico() );
    }
}
