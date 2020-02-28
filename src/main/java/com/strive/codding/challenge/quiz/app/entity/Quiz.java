package com.strive.codding.challenge.quiz.app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Question> questions;
}
