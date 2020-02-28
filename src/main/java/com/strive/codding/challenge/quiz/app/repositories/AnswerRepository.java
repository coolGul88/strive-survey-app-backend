package com.strive.codding.challenge.quiz.app.repositories;

import com.strive.codding.challenge.quiz.app.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
