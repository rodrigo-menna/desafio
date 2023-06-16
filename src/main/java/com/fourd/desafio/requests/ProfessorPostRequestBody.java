package com.fourd.desafio.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProfessorPostRequestBody {
    @NotBlank(message = "nome can not be null or empty")
    private String nome;
}
