package com.example.demo.api;

import com.example.demo.dto.SurveyDTO;
import com.example.demo.entity.Survey;
import com.example.demo.manager.SurveyManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
public class SurveyController {

    private SurveyManager surveyManager;

    public SurveyController(SurveyManager surveyManager) {
        this.surveyManager = surveyManager;
    }

    @GetMapping("/surveys/{id}")
    public ResponseEntity<Survey> getSurveys(@PathVariable("id") Long id) {
        Optional<Survey> survey = surveyManager.findById(id);
        return ResponseEntity.of(survey);
    }

    @PostMapping("/surveys")
    public ResponseEntity<String> createNewSurvey(@RequestBody SurveyDTO surveyDTO) {
        Survey newSurvey = new Survey(surveyDTO.getName(), surveyDTO.getDescription());
        newSurvey = surveyManager.save(newSurvey);
        return ResponseEntity.created(URI.create("/surveys/" + newSurvey.getId())).build();
    }
}
