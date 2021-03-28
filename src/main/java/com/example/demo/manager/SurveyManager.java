package com.example.demo.manager;

import com.example.demo.entity.Survey;
import com.example.demo.dao.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SurveyManager {


        private SurveyRepo surveyRepo;

        @Autowired
        public SurveyManager(SurveyRepo surveyRepo) {this.surveyRepo=surveyRepo;}


        public List<Survey> findAll(){
        return surveyRepo.findAll();
    }

        public Optional<Survey> findById(Long id){
            return surveyRepo.findById(id);
        }

        public List<Survey> findByName(String name){
        return surveyRepo.findByName(name);
    }


        public Survey save(Survey survey){
            return surveyRepo.save(survey);
        }

        public void deleteById(Long id){
            surveyRepo.deleteById(id);
        }



}
