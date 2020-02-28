package com.strive.codding.challenge.quiz.app.controller;

import com.strive.codding.challenge.quiz.app.model.Quiz;
import com.strive.codding.challenge.quiz.app.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;

    @GetMapping("/survey/{surveyId}/quiz")
    public Quiz getQuizForSurvey(@PathVariable(name = "surveyId") long surveyId) {
        com.strive.codding.challenge.quiz.app.entity.Quiz q = quizRepository.findBySurveyId(surveyId);
        Quiz quiz = new Quiz();
        if (q != null) {
            quiz.setQuizId(q.getQuizId());
            quiz.setQuestions(q.getQuestions());
            quiz.setSurvey(q.getSurvey());
        }
        return quiz;
    }
}
