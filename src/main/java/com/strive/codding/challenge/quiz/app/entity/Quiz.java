package com.strive.codding.challenge.quiz.app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;
    @ElementCollection
    private List<Long> questions;

    public Quiz() {
    }

    public Quiz( List<Long> questions){
        this.questions = questions;
    }

    public Long getQuizId() {
        return quizId;
    }

    public List<Long> getQuestions() {
        return questions;
    }
}
