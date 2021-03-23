package com.example.demo.manager;

import com.example.demo.entity.Survey;
import com.example.demo.dao.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SurveyManager {


        private SurveyRepo surveyRepo;

        @Autowired
        public SurveyManager(SurveyRepo surveyRepo) {this.surveyRepo=surveyRepo;}


        public Iterable<Survey> findAll(){
            return surveyRepo.findAll();
        }

        public Survey save(Survey survey){
            return surveyRepo.save(survey);
        }

        public void deleteById(Long id){
            surveyRepo.deleteById(id);
        }



}
