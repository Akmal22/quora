package com.mycompany.controller.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Data
@Accessors(chain = true)
public class AuthenticationRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
