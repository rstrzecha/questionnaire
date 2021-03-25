package com.example.demo.manager;

import com.example.demo.entity.Survey;
import com.example.demo.dao.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SurveyManager {


        private SurveyRepo surveyRepo;

        @Autowired
        public SurveyManager(SurveyRepo surveyRepo) {this.surveyRepo=surveyRepo;}


        public List<Survey> findAll(){
            return surveyRepo.findAll();
        }

        public Iterable<Survey> findByName(String name){
        return surveyRepo.findByName(name);
    }


        public Survey save(Survey survey){
            return surveyRepo.save(survey);
        }

        public void deleteById(Long id){
            surveyRepo.deleteById(id);
        }



}
