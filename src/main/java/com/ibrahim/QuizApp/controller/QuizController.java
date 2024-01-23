package com.ibrahim.QuizApp.controller;

import com.ibrahim.QuizApp.entity.Question;
import com.ibrahim.QuizApp.entity.QuestionWrapper;
import com.ibrahim.QuizApp.entity.Quiz;
import com.ibrahim.QuizApp.entity.Response;
import com.ibrahim.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title ){

        return quizService.createQuiz(category,numQ,title);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Long id){
      return   quizService.getQuizQuestion(id);
    }

    @PostMapping("/submit/{id}")
    public ResponseEntity<Long> submitQuiz(@PathVariable Long id, @RequestBody List<Response> response){

        return quizService.calculateResult(id, response);
    }
}
