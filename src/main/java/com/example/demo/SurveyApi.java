package com.example.demo;



import com.example.demo.entity.Survey;
import com.example.demo.manager.SurveyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("survey")
public class SurveyApi {

    private SurveyManager surveyManager;

    @Autowired
    public SurveyApi(SurveyManager surveyManager){
        this.surveyManager = surveyManager;
    }

    @GetMapping("/all")
    public Iterable<Survey> getAll(){return surveyManager.findAll();}

    @GetMapping("/findByName")
    public Iterable<Survey> findByName(String name){
        return surveyManager.findByName(name);
    }

    @PostMapping
    public Survey addSurvey(@RequestBody Survey survey){
        return surveyManager.save(survey);
    }

    @DeleteMapping
    public void deleteSurvey(@RequestParam Long id){
        surveyManager.deleteById(id);
    }




}
