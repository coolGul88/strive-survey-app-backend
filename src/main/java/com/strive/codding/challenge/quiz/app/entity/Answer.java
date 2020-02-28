package com.strive.codding.challenge.quiz.app.entity;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String answer;
    @OneToOne
    private Question question;
    @ManyToOne
    private SurveyResult surveyResult;
}
