package com.strive.codding.challenge.quiz.app.controller;

import com.strive.codding.challenge.quiz.app.entity.Quiz;
import com.strive.codding.challenge.quiz.app.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("/quiz")
    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }
}
