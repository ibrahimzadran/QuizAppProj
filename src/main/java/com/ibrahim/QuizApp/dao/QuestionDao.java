package com.ibrahim.QuizApp.dao;

import com.ibrahim.QuizApp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository <Question,Long> {
}
