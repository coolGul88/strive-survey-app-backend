package com.strive.codding.challenge.quiz.app.model;

import java.util.List;

public class Quiz {
    private Long quizId;
    private List<Question> questions;
    private Long survey;

    public Quiz() {

    }

    public Quiz(Long quizId, List<Question> questions, Long survey) {
        this.quizId = quizId;
        this.questions = questions;
        this.survey = survey;
    }

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

    public Long getSurvey() {
        return survey;
    }

    public void setSurvey(Long survey) {
        this.survey = survey;
    }
}
