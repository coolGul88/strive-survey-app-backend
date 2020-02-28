package com.strive.codding.challenge.quiz.app.repositories;

import com.strive.codding.challenge.quiz.app.entity.SurveyResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyResultRepository extends JpaRepository<SurveyResult, Long> {
    @Override
    SurveyResult save(SurveyResult s);
}
