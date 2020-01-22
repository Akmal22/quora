package com.mycompany.controller;

import com.mycompany.controller.dto.Question;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @GetMapping
    public List<Question> questions() {
        return Collections.EMPTY_LIST;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Question addQuestion(@RequestBody Question question) {
        return question;
    }

    @PutMapping(value = "/{questionId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Question putQuestion(@PathVariable Long questionId,
                                @RequestBody Question question) {
        return question;
    }

    @DeleteMapping(value = "/{questionId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Question deleteQuestion(@PathVariable Long questionId) {
        return new Question();
    }
}
