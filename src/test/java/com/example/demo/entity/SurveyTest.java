package com.example.demo.entity;

import com.example.demo.dao.SurveyRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class SurveyTest {

    @Autowired
    private SurveyRepo surveyRepo;

    @Test
    // @Rollback(false) jesli chcemy aby wartosci testowe zostaly dodane do bazy
    public void testCreateSurvey(){
        Survey survey= new Survey("Janusz", "Pierwszy Test", LocalDate.of(2020,12,12));
        Survey savedSurvey = surveyRepo.save(survey);

        assertNotNull(savedSurvey);
    }

   /* @Test
    public void testDeleteByIdSurvey(){

        surveyRepo.deleteById(survey.getId());
        assertNull(survey);
    }
*/
   /* @Test
    public void testFindSurveyByName(){
        String name="Kowalski";
        Iterable<Survey> surveys=surveyRepo.findByName(name);

        assertIterableEquals(surveys,);


    }*/

   /* @Test
    public void testFindSurveyByNameNotExist(){
        String name="Beznazwiska";
        Survey survey= surveyRepo.findByName(name);

        assertEquals(name,null);
    }*/
}