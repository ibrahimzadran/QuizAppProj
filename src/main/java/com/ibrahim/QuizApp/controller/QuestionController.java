package com.ibrahim.QuizApp.controller;

import com.ibrahim.QuizApp.entity.Question;
import com.ibrahim.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionController {
    @Autowired
QuestionService questionService;
    @GetMapping("/AllQuestions")
    public ResponseEntity <List<Question >>getAllQuestion(){
        return  questionService.getAllQuestion();
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){

        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
