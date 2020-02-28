package com.strive.codding.challenge.quiz.app;

import com.strive.codding.challenge.quiz.app.entity.Question;
import com.strive.codding.challenge.quiz.app.entity.Quiz;
import com.strive.codding.challenge.quiz.app.entity.Survey;
import com.strive.codding.challenge.quiz.app.repositories.QuestionRepository;
import com.strive.codding.challenge.quiz.app.repositories.QuizRepository;
import com.strive.codding.challenge.quiz.app.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SurveyApplication {
    @Autowired
    private SurveyRepository surveyRepository;
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private QuizRepository quizRepository;

    public static void main(String[] args) {
        SpringApplication.run(SurveyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            List<Long> questions = new ArrayList<>();
            for (int i = 1; i < 6; i++) {
                Question question = new Question("Can you answer question" + i + "?");
                questions.add(questionRepository.save(question).getId());
            }
            Quiz quiz = new Quiz(questions);
            quiz = quizRepository.save(quiz);
            surveyRepository.save(new Survey("survey1", quiz.getQuizId()));
        };
    }

}
