package com.strive.codding.challenge.quiz.app.controller;

import com.strive.codding.challenge.quiz.app.entity.Quiz;
import com.strive.codding.challenge.quiz.app.entity.Survey;
import com.strive.codding.challenge.quiz.app.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyController {
    @Autowired
    private SurveyRepository surveyRepository;

    @GetMapping("/survey")
    public List<Survey> getAllSurvey() {
        return surveyRepository.findAll();
    }

}