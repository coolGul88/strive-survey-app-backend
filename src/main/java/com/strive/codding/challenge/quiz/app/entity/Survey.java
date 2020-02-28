package com.strive.codding.challenge.quiz.app.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Column
    private String name;
    @Column
    @NotNull
    private Long quizId;

    public Survey() {
    }

    public Survey( String name, Long quizId){
        this.name = name;
        this.quizId = quizId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getQuiz() {
        return quizId;
    }


}
