package com.strive.codding.challenge.quiz.app.repositories;

import com.strive.codding.challenge.quiz.app.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

    List<Survey> findAll();
}
