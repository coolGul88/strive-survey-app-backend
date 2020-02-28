package com.strive.codding.challenge.quiz.app.controller;

import com.strive.codding.challenge.quiz.app.model.Survey;
import com.strive.codding.challenge.quiz.app.repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SurveyController {
    @Autowired
    private SurveyRepository surveyRepository;

    @GetMapping("/survey")
    @ResponseBody
    public List<Survey> getAllSurvey() {
        List<Survey> surveys = new ArrayList<>();
        surveyRepository.findAll().stream().forEach(survey -> { Survey s = new Survey();
        s.setId(survey.getId());
        s.setName(survey.getName());
        s.setQuiz(survey.getQuiz());
        surveys.add(s);});
        return surveys;
    }

}
