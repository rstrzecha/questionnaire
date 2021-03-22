package com.example.demo.manager;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class QuestionManager {

    private QuestionRepo questionRepo;

    @Autowired
    public QuestionManager( QuestionRepo questionRepo) {this.questionRepo=questionRepo;}


    public Iterable<Question> findAll(){
        return questionRepo.findAll();
    }

    public Question save(Question question){
        return questionRepo.save(question);
    }

    public void deleteById(Long id){
        questionRepo.deleteById(id);
    }


}
