package com.strive.codding.challenge.quiz.app.repositories;

import com.strive.codding.challenge.quiz.app.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
