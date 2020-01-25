package com.mycompany.controller;

import com.mycompany.controller.dto.AppStatus;
import com.mycompany.controller.dto.HealthCheckDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/check")
    public ResponseEntity<HealthCheckDto> checkApp() {
        return ResponseEntity.ok(new HealthCheckDto(AppStatus.OK));
    }
}
