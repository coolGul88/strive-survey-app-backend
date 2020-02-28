package com.strive.codding.challenge.quiz.app.repositories;

import com.strive.codding.challenge.quiz.app.entity.Quiz;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface QuizRepository extends PagingAndSortingRepository<Quiz, Long> {

    List<Quiz> findAll();

    Quiz findBySurveyId(Long surveyId);
}
