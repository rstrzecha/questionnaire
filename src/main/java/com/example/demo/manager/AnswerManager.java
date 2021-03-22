package com.example.demo.manager;

import com.example.demo.dao.AnswerRepo;
import com.example.demo.entity.Answer;
import com.example.demo.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerManager {

    private AnswerRepo answerRepo;

    @Autowired
    public AnswerManager(AnswerRepo answerRepo) {
        this.answerRepo = answerRepo;
    }


    public Iterable<Answer> findAll() {
        return answerRepo.findAll();
    }

    public Answer save(Answer answer) {
        return answerRepo.save(answer);
    }

    public void deleteById(Long id) {
        answerRepo.deleteById(id);
    }

}
