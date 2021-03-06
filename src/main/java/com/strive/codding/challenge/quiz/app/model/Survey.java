package com.strive.codding.challenge.quiz.app.model;


public class Survey {
    private Long id;
    private String name;
    private Quiz quiz;

    public Survey() {
    }

    public Survey(Long id, String name, Quiz quiz) {
        this.id = id;
        this.name = name;
        this.quiz = quiz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
