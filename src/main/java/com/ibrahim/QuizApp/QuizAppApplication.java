package com.ibrahim.QuizApp;

import com.ibrahim.QuizApp.dao.QuestionDao;
import com.ibrahim.QuizApp.entity.Question;
import com.ibrahim.QuizApp.service.QuestionService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class QuizAppApplication implements CommandLineRunner {
	@Autowired
	private QuestionDao questionDao;
	@Autowired
	private QuestionService questionService;


	public static void main(String[] args) {
		SpringApplication.run(QuizAppApplication.class, args);
		System.out.println("Application started...");
	}

	@Override
	public void run(String... args) throws Exception {
		List<Question> questions= Arrays.asList(
				new Question("Automatic type conversion is possible in which of the possible cases?",
						"Byte to Int",
						"Int to Long",
						"Long to Int",
						"Short to Int",
						"Int to Long",
						"rookie")
				);
		questionDao.saveAll(questions);

	}


}
