package com.mycompany.controller.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class HealthCheckDto {
    private final AppStatus status;
}
