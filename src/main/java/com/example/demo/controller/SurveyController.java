package com.example.demo.controller;

import com.example.demo.dao.SurveyRepo;
import com.example.demo.entity.Survey;
import com.example.demo.manager.SurveyManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SurveyController {

    private SurveyRepo surveyRepo;
    private SurveyManager surveyManager;
    public SurveyController(SurveyRepo surveyRepo, SurveyManager surveyManager) {
        this.surveyRepo = surveyRepo;
        this.surveyManager = surveyManager;
    }

    @RequestMapping(value = {"/surveys"}, method = RequestMethod.GET)
    public String getSurveys(Model model) {
        List<Survey> surveyList = surveyManager.findAll();
        model.addAttribute("survey", surveyList);
        return "/survey/surveys";
    }

    @RequestMapping(value = {"/dosurvey"}, method = RequestMethod.GET)
    public String getDoSurvey() {
        return "/survey/doSurvey";
    }

}
