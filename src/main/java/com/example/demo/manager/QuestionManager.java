package com.example.demo.manager;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.entity.Question;
import com.example.demo.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionManager {

    private QuestionManager questionManager;

    @Autowired
    public QuestionManager(QuestionManager questionManager) {this.questionManager=questionManager;}


    public Iterable<Question> findAll(){
        return questionManager.findAll();
    }

    public Question save(Question question){
        return questionManager.save(question);
    }

    public void deleteById(Long id){
        questionManager.deleteById(id);
    }


}
