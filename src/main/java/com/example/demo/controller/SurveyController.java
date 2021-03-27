package com.example.demo.controller;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.dao.SurveyRepo;
import com.example.demo.entity.Question;
import com.example.demo.entity.Survey;
import com.example.demo.manager.QuestionManager;
import com.example.demo.manager.SurveyManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SurveyController {

    private SurveyRepo surveyRepo;
    private SurveyManager surveyManager;

//    public SurveyController(SurveyRepo surveyRepo, SurveyManager surveyManager) {
//        this.surveyRepo = surveyRepo;
//        this.surveyManager = surveyManager;
//    }

    private QuestionRepo questionRepo;
    private QuestionManager questionManager;

//    public SurveyController() {
//        this.questionRepo = questionRepo;
//        this.questionManager = questionManager;
//    }

    public SurveyController(SurveyRepo surveyRepo, SurveyManager surveyManager, QuestionRepo questionRepo, QuestionManager questionManager) {
        this.surveyRepo = surveyRepo;
        this.surveyManager = surveyManager;
        this.questionRepo = questionRepo;
        this.questionManager = questionManager;
    }

    @RequestMapping(value = {"/surveys"}, method = RequestMethod.GET)
    public String getSurveys(Model model) {
        List<Survey> surveyList = surveyManager.findAll();
        model.addAttribute("survey", surveyList);
        return "/survey/surveys";
    }

    @RequestMapping(value = {"/dosurvey/{id}"}, method = RequestMethod.GET)
    public String getDoSurvey(Model model, @PathVariable String id) {
        Survey survey = surveyManager.findById(Long.parseLong(id)).get();

        model.addAttribute("survey", survey);
        model.addAttribute("questions", survey.getQuestion());
        return "/survey/doSurvey";
    }

}
