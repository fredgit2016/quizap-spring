package com.proxiad.quizapp.dao;

import com.proxiad.quizapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> getAllQuestionsByCategory(String category);
}
