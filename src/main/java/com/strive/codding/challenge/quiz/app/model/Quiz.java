package com.strive.codding.challenge.quiz.app.model;

import com.strive.codding.challenge.quiz.app.entity.Question;
import com.strive.codding.challenge.quiz.app.entity.Survey;

import java.util.List;

public class Quiz {
    private Long quizId;
    private List<Question> questions;
    private Survey survey;

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
}
