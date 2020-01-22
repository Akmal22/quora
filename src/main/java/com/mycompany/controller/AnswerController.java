package com.mycompany.controller;

import com.mycompany.controller.dto.Answer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @GetMapping(value = "/{questionId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Answer> getAnswers(@PathVariable Long questionId) {
        return Collections.EMPTY_LIST;
    }

    @PostMapping(value = "/{questionId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Answer addAnswer(@PathVariable Long questionId,
                            @RequestBody Answer answer) {
        return answer;
    }

    @PutMapping(value = "/{answerId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Answer putAnswer(@PathVariable Long answerId,
                            @RequestBody Answer answer) {
        return answer;
    }

    @DeleteMapping(value = "/{answerId}")
    public Answer deleteAnswer(@PathVariable Long answerId) {
        return new Answer();
    }


}
