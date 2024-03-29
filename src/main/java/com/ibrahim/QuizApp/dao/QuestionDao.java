package com.ibrahim.QuizApp.dao;

import com.ibrahim.QuizApp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository <Question,Long> {
   List<Question> findByCategory(String category);

   @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RAND() LIMIT :numQ OFFSET 0", nativeQuery = true)
   List<Question> findRandomQuestionsByCategory(String category, int numQ);

}
