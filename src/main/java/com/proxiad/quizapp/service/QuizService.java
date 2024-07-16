package com.proxiad.quizapp.service;

import com.proxiad.quizapp.dao.QuizDao;
import com.proxiad.quizapp.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    private QuizDao quizDao;

    public Quiz create() {
        return null;
    }
}
