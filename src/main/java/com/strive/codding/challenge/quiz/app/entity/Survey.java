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
    @JoinColumn
    @OneToOne
    private Quiz quiz;

    public Survey() {

    }

    public Survey(String name) {
        this.name = name;
    }

}
