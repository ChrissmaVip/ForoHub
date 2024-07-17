package com.ForoHub.Foro.Topico;

import jakarta.validation.constraints.NotBlank;

public record DtoTopico(

       @NotBlank String titulo,
       @NotBlank String mensaje,
        @NotBlank String autor,
        @NotBlank String curso


                        ) {

}
