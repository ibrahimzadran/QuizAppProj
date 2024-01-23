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
		List<Question> questions = Arrays.asList(
				new Question("What is the purpose of the ''final'' keyword in Java?", "To declare a constant", "To mark a class as final", "To prevent method overriding", "All of the above", "d", "Medium", "Java"),
				new Question("What is the difference between ''== and ''.equals()'' in Java?", "They are the same", "''=='' compares object references, ''.equals()'' compares content", "'''.equals()'' compares object references, ''=='' compares content", "Both compare content", "b", "Easy", "Java"),
				new Question("What is the use of ''StringBuilder'' in Java?", "To create mutable strings", "To create immutable strings", "To parse XML documents", "To define constants", "a", "Medium", "Java"),
				new Question("How is an interface different from an abstract class in Java?", "Interfaces can have concrete methods, abstract classes cannot", "Abstract classes can have final methods, interfaces cannot", "Interfaces support multiple inheritance, abstract classes do not", "Abstract classes can have static methods, interfaces cannot", "c", "Hard", "Java"),
				new Question("What is the purpose of the ''try-catch'' block in Java?", "To handle runtime exceptions", "To declare checked exceptions", "To define custom exceptions", "Both a and b", "a", "Easy", "Java"),
				new Question("What is the difference between ''ArrayList'' and ''LinkedList'' in Java?", "''ArrayList'' is synchronized, ''LinkedList'' is not", "''ArrayList'' is faster for random access, ''LinkedList'' is faster for insertion and deletion", "''ArrayList'' does not allow null elements, ''LinkedList'' does", "Both have the same performance characteristics", "b", "Medium", "Java"),
				new Question("How can you achieve multithreading in Java?", "By extending the ''Thread'' class", "By implementing the ''Runnable'' interface", "By using the ''ExecutorService'' framework", "All of the above", "d", "Medium", "Java"),
				new Question("What is the purpose of the ''this'' keyword in Java?", "To refer to the current instance of the class", "To call a superclass method", "To create a new instance of a class", "To declare a constant", "a", "Easy", "Java"),
				new Question("What is the difference between ''break'' and ''continue'' statements in Java?", "''Break'' terminates the loop, ''continue'' skips the current iteration", "''Continue'' terminates the loop, ''break'' skips the current iteration", "Both are used to terminate the loop", "Both are used to skip the current iteration", "a", "Easy", "Java"),
				new Question("What is the purpose of the ''enum'' keyword in Java?", "To define a new class", "To define a variable that can take one of a predefined set of values", "To declare a constant", "To create an array", "b", "Medium", "Java"),
				new Question("What is method overloading in Java?", "It allows a method to be defined in multiple classes", "It allows a method to have multiple implementations with different parameters", "It allows a method to override another method in a superclass", "It allows a method to have multiple return types", "b", "Easy", "Java"),
				new Question("How does Java support garbage collection?", "By using the ''delete'' keyword", "Automatically, through the JVM", "By using the ''free()'' function", "Both a and c", "b", "Medium", "Java"),
				new Question("What is the purpose of the ''super'' keyword in Java?", "To call the superclass constructor", "To refer to the current instance of the superclass", "To invoke a superclass method", "Both a and c", "d", "Medium", "Java"),
				new Question("How can you handle concurrent modification in Java collections?", "By using ''synchronized'' collections", "By using the ''Iterator'' interface", "By using the ''volatile'' keyword", "Both a and b", "d", "Hard", "Java"),
				new Question("What is the purpose of the ''instanceof'' operator in Java?", "To check if an object is an instance of a specific class", "To compare two objects for equality", "To check if a class is abstract", "To create an instance of a class", "a", "Easy", "Java"),
				new Question("What is the purpose of the ''volatile'' keyword in Java?", "To declare a variable as constant", "To make a variable thread-safe", "To create a singleton class", "None of the above", "b", "Medium", "Java"),
				new Question("What is the ''NullPointerException'' in Java?", "It occurs when dividing by zero", "It occurs when a method is not implemented", "It occurs when trying to access an object that is null", "It occurs when there is a syntax error in the code", "c", "Easy", "Java"),
				new Question("What is the purpose of the ''break'' statement in Java?", "To terminate the loop or switch statement", "To skip the current iteration of the loop", "To exit a method", "Both a and b", "a", "Easy", "Java"),
				new Question("Automatic type conversion is possible in which of the possible cases?", "Byte to Int", "Int to Long", "Long to Int", "Short to Int", "Int to Long", "rookie", "Java")
		);

		questionDao.saveAll(questions);

	}


}
