package com.example.demo.manager;

import com.example.demo.dao.SurveyRepo;
import com.example.demo.entity.Survey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
@RunWith(SpringRunner.class)
*/
@DataJpaTest

class SurveyManagerTest {

    @Autowired
    private SurveyRepo surveyRepo;

    @Test
    // @Rollback(false) jesli chcemy aby wartosci testowe zostaly dodane do bazy
    public void testCreateSurvey(){
        Survey survey= new Survey("Janusz", "Pierwszy Test", LocalDate.of(2020,12,12));
        surveyRepo.save(survey);

        assertNotNull(survey.getId());
    }

 /*   @Test
    public void testDeleteByIdSurvey(){
        Survey survey= new Survey("Janusz2", "Pierwszy Test", LocalDate.of(2020,12,12));
        surveyRepo.save(survey);

        surveyRepo.deleteById(survey.getId());
        Survey deleted=surveyRepo.findById(survey.getId()).get();   // TUTAJ JEST 'NO VALUE PRESENT'
        assertNull(deleted);
    }*/

    @Test
    public void testFindAll(){
        Survey survey= new Survey("Kowalski", "Pierwszy Test", LocalDate.of(2020,12,12));
        Survey survey2= new Survey("Kowalski2", "Pierwszy Test", LocalDate.of(2020,12,12));
        surveyRepo.save(survey);
        surveyRepo.save(survey2);
        List<Survey> surveys=surveyRepo.findAll();

        assertNotNull(surveys);
        assertEquals(2, surveys.size());
            }

}