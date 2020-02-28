package com.strive.codding.challenge.quiz.app.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @NotNull
    private String question;

    public Question(){

    }

    public Question(String question){
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }
}
