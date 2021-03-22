package com.example.demo.manager;

import com.example.demo.entity.Survey;
import com.example.demo.dao.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

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




    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Survey("Kowalski", "Pierwsza Ankieta", LocalDate.of(2020, 1, 8)));
        save(new Survey("Nowak", "Ciekawostki", LocalDate.of(2021, 1, 8)));
        save(new Survey("Brzeczyszczykiewicz", "Co dalej", LocalDate.of(2021,2,24)));
    }
}
