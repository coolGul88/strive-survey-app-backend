package com.strive.codding.challenge.quiz.app.controller;

import com.strive.codding.challenge.quiz.app.model.Question;
import com.strive.codding.challenge.quiz.app.model.Quiz;
import com.strive.codding.challenge.quiz.app.model.Survey;
import com.strive.codding.challenge.quiz.app.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class QuizController {
    @Autowired
    private QuizRepository quizRepository;

//    @GetMapping("/survey/{surveyId}/quiz")
//    public Quiz getQuizForSurvey(@PathVariable(name = "surveyId") long surveyId) {
//        com.strive.codding.challenge.quiz.app.entity.Quiz q = quizRepository.findBySurveyId(surveyId);
//        Quiz quiz = new Quiz();
//        if (q != null) {
//            quiz.setQuizId(q.getQuizId());
//            quiz.setQuestions(q.getQuestions().stream().map( ques -> {
//                Question question = new Question();
//                question.setId(ques.getId());
//                question.setQuestion(ques.getQuestion());
//                return question;
//            }).collect(Collectors.toList()));
//        }
//        return quiz;
//    }
}
