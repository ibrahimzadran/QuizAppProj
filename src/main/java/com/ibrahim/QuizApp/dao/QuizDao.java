package com.ibrahim.QuizApp.dao;

import com.ibrahim.QuizApp.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Long> {
}
