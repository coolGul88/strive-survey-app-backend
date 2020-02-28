package com.strive.codding.challenge.quiz.app.controller;

import com.strive.codding.challenge.quiz.app.model.Question;
import com.strive.codding.challenge.quiz.app.model.Quiz;
import com.strive.codding.challenge.quiz.app.model.Survey;
import com.strive.codding.challenge.quiz.app.model.SurveyResult;
import com.strive.codding.challenge.quiz.app.repositories.QuestionRepository;
import com.strive.codding.challenge.quiz.app.repositories.QuizRepository;
import com.strive.codding.challenge.quiz.app.repositories.SurveyRepository;
import com.strive.codding.challenge.quiz.app.repositories.SurveyResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = {"*"})
public class SurveyController {
    @Autowired
    private SurveyRepository surveyRepository;
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private SurveyResultRepository surveyResultRepository;

    @GetMapping("/survey")
    @ResponseBody
    public List<Survey> getAllSurvey() {
        List<Survey> surveys = new ArrayList<>();
        surveyRepository.findAll().stream().forEach(survey -> {
            Survey s = new Survey();
            s.setId(survey.getId());
            s.setName(survey.getName());
            com.strive.codding.challenge.quiz.app.entity.Quiz quiz = quizRepository.findById(survey.getQuiz()).get();
            List<Question> questions = quiz.getQuestions().stream().map(q -> {
                com.strive.codding.challenge.quiz.app.model.Question ques =
                        new com.strive.codding.challenge.quiz.app.model.Question();
                ques.setQuestion(questionRepository.findById(q).get().getQuestion());
                ques.setId(questionRepository.findById(q).get().getId());
                return ques;
            }).collect(Collectors.toList());
            s.setQuiz(new Quiz(survey.getQuiz(), questions, survey.getId()));
            surveys.add(s);
        });
        return surveys;
    }

    @PostMapping("/surveyResult")
    public void postSurveyResult(@RequestBody SurveyResult surveyResult) {
        com.strive.codding.challenge.quiz.app.entity.SurveyResult result =
                new com.strive.codding.challenge.quiz.app.entity.SurveyResult();
//        result.setAnswers(surveyResult.getAnswers());
//        result.setEmailId(surveyResult.getEmailId());
//        Survey survey =
//                this.surveyResultRepository.save(result);
    }

}
