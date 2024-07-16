package com.proxiad.quizapp.service;

import com.proxiad.quizapp.dao.QuestionDao;
import com.proxiad.quizapp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionDao.getAllQuestionsByCategory( category);
    }

    public Question addQuestion(Question newQuestion) {
        return questionDao.save(newQuestion);
    }
}
