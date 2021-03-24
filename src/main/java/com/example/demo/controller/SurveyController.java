package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SurveyController {

    @RequestMapping(value = {"/surveys"}, method = RequestMethod.GET)
    public String getSurveys() {
        return "/survey/surveys";
    }

    @RequestMapping(value = {"/dosurvey"}, method = RequestMethod.GET)
    public String getDoSurvey() {
        return "/survey/doSurvey";
    }

}
