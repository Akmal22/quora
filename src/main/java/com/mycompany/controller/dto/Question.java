package com.mycompany.controller.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Question {
    private String text;
    private List<Answer> answers;
}
