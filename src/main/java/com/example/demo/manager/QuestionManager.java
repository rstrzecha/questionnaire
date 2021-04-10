package com.example.demo.manager;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionManager {

    private QuestionRepo questionRepo;
    private Question question;

    @Autowired
    public QuestionManager( QuestionRepo questionRepo) {this.questionRepo=questionRepo;}

    public List<Question> findAll(){
        return questionRepo.findAll();
    }

    public Question save(Question question){
        return questionRepo.save(question);
    }

    public void deleteById(Long id){
        questionRepo.deleteById(id);
    }

    //public void setById(Long id) {  questionRepo.setById(id); }

    public void setSelection(String selection) {
        switch (selection.charAt(0)){
            case 'A':
                question.setCountOptionA(question.getCountOptionA()+1);
                break;
            case 'B':
                question.setCountOptionB(question.getCountOptionB()+1);
                break;
            case 'C':
                question.setCountOptionC(question.getCountOptionC()+1);
                break;
            case 'D':
                question.setCountOptionD(question.getCountOptionD()+1);
                break;
        }

        questionRepo.save(question); }
}
