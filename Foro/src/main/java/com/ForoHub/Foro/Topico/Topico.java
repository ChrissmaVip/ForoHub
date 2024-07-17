package com.ForoHub.Foro.Topico;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String mensaje;
    @Column(name = "fecha_de_creacion")
    private LocalDateTime fechaDeCreacion;
    @Column(name = "estado_del_topico")
    private Boolean estadoDelTopico;
    private String autor;
    private String curso;

    public Topico(DtoTopico dtoTopico) {
        this.titulo = dtoTopico.titulo();
        this.mensaje =dtoTopico.mensaje();
        this.autor = dtoTopico.autor();
        this.curso = dtoTopico.curso();
        this.fechaDeCreacion = LocalDateTime.now();
        this.estadoDelTopico = true;
    }

    @Override
    public String toString() {
        return "***Topico***\n" +
                "id= " + id + "\n"+
                "titulo= " + titulo + "\n"+
                "mensaje= " + mensaje + "\n"+
                "fechaDeCreacion= " + fechaDeCreacion + "\n"+
                "estadoDelTopico= " + estadoDelTopico + "\n"+
                "autor= " + autor + "\n"+
                "curso= " + curso +"\n";
    }
}
