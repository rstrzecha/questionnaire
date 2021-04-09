package com.example.demo.controller;

import com.example.demo.entity.Question;
import com.example.demo.entity.Survey;
import com.example.demo.manager.QuestionManager;
import com.example.demo.manager.SurveyManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class QuestionController {

    private QuestionManager questionManager;
    private SurveyManager surveyManager;

    public QuestionController(QuestionManager questionManager, SurveyManager surveyManager) {
        this.questionManager = questionManager;
        this.surveyManager = surveyManager;
    }

    @RequestMapping(value = {"/saveQuestion/{surveyId}"}, method = RequestMethod.POST)
    public RedirectView saveAddQuestion(@ModelAttribute Question newQuestion, @PathVariable("surveyId") Long surveyId) {
        Optional<Survey> survey = surveyManager.findById(surveyId);
        Question question = newQuestion;

        survey.ifPresent(s -> question.setSurvey(s));
        questionManager.save(question);
        return new RedirectView("/editSurvey/{surveyId}");
    }



}
