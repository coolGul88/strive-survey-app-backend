package com.strive.codding.challenge.quiz.app;

import com.strive.codding.challenge.quiz.app.entity.Survey;
import com.strive.codding.challenge.quiz.app.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SurveyApplication {
    @Autowired
    private SurveyRepository surveyRepository;

    public static void main(String[] args) {
        SpringApplication.run(SurveyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            surveyRepository.save(new Survey("survey1"));
        };
    }

}
