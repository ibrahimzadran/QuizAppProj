package com.ibrahim.QuizApp.service;

import com.ibrahim.QuizApp.dao.QuestionDao;
import com.ibrahim.QuizApp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService  {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestion() {

        return questionDao.findAll();
    }
}
