package com.example.demo.api;

import com.example.demo.dto.QuestionDTO;
import com.example.demo.dto.SurveyDTO;
import com.example.demo.entity.Question;
import com.example.demo.entity.Survey;
import com.example.demo.manager.QuestionManager;
import com.example.demo.manager.SurveyManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class QuestionController {

    private SurveyManager surveyManager;
    private QuestionManager questionManager;

    public QuestionController(SurveyManager surveyManager, QuestionManager questionManager) {
        this.surveyManager = surveyManager;
        this.questionManager = questionManager;
    }

    @PostMapping("/surveys/{surveyId}/questions")
    public ResponseEntity<Question> createNewSurvey(@PathVariable("surveyId") Long surveyId, @RequestBody QuestionDTO questionDTO) {
        List<String> options = questionDTO.getOptions();
        Question question = new Question(questionDTO.getText(), options.get(0), options.get(1));
        Optional<Survey> survey = surveyManager.findById(surveyId);
        survey.ifPresent(s -> question.setSurvey(s));
        questionManager.save(question);
        return ResponseEntity.of(Optional.of(question));
    }
}
