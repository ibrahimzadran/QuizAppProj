package com.ibrahim.QuizApp.service;

import com.ibrahim.QuizApp.dao.QuestionDao;
import com.ibrahim.QuizApp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService  {
    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<List<Question>> getAllQuestion() {

        try {

            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question> >getQuestionByCategory(String category) {
       try {
           return new  ResponseEntity<> (questionDao.findByCategory(category), HttpStatus.OK);
       }catch (Exception e){
           e.printStackTrace();
       }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
       try {
           questionDao.save(question);
       }catch (Exception e){
           e.printStackTrace();
       }
         return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }
}
