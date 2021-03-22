package com.example.demo.manager;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.entity.Question;
import com.example.demo.entity.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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

/*    @EventListener(ApplicationReadyEvent.class)
    public void fillDBa() {
        save(new Survey("Podoba Ci sie nasze dzieło",1));*/


}
