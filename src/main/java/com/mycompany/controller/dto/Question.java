package com.mycompany.controller.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Question {
    private String title;
    private String description;
    private List<Answer> answers;
}
