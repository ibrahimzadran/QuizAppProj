package com.ibrahim.QuizApp.controller;

import com.ibrahim.QuizApp.entity.Question;
import com.ibrahim.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
QuestionService questionService;
    @GetMapping("/AllQuestions")
    public List<Question > getAllQuestion(){
        return questionService.getAllQuestion() ;

    }
}
