package com.strive.codding.challenge.quiz.app.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class SurveyResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @NotNull
    private String emailId;
    @JoinColumn(unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Survey survey;
    @JoinColumn(unique = true)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Answer> answers;
}
