package com.mycompany.controller;

import com.mycompany.auth.UserAuthenticationService;
import com.mycompany.controller.dto.AuthenticationRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("public")
public class AuthenticationController {
    private final UserAuthenticationService userAuthenticationService;

    public AuthenticationController(UserAuthenticationService userAuthenticationService) {
        this.userAuthenticationService = userAuthenticationService;
    }

    @PostMapping(value = "login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String authenticate(@Valid @RequestBody AuthenticationRequest request) {
        return userAuthenticationService.login(request.getUsername(), request.getPassword());
    }
}
