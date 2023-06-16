package com.fourd.desafio.security.auth.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

    @NotBlank(message = "login can not be null or empty")
    private String login;
    @NotBlank(message = "password can not be null or empty")
    private String password;
}
