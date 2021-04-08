package com.example.demo.controller;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.dao.SurveyRepo;
import com.example.demo.entity.Survey;
import com.example.demo.manager.QuestionManager;
import com.example.demo.manager.SurveyManager;
import com.example.demo.model.AnswerForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SurveyController {

    private SurveyRepo surveyRepo;
    private SurveyManager surveyManager;

    private QuestionRepo questionRepo;
    private QuestionManager questionManager;

    private AnswerForm answerForm;

    public SurveyController(SurveyRepo surveyRepo, SurveyManager surveyManager, QuestionRepo questionRepo,
                            QuestionManager questionManager, AnswerForm answerForm) {
        this.surveyRepo = surveyRepo;
        this.surveyManager = surveyManager;
        this.questionRepo = questionRepo;
        this.questionManager = questionManager;
        this.answerForm = answerForm;
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
        model.addAttribute("questions", survey.getQuestions());
        model.addAttribute("answerForm", answerForm);
        return "/survey/doSurvey";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("answerForm") AnswerForm answerForm) {
        System.out.println(answerForm);
//        System.out.println(answerForm.getAnswers());
//        List<Contact> contacts = contactForm.getContacts();

//        if(null != contacts && contacts.size() > 0) {
//            ContactController.contacts = contacts;
//            for (Contact contact : contacts) {
//                System.out.printf("%s \t %s \n", contact.getFirstname(), contact.getLastname());
//            }
//        }

        return new ModelAndView("/index", "answerForm", answerForm);
    }

    @RequestMapping(value = {"/editSurveys"}, method = RequestMethod.GET)
    public String getSurveysToEdit(Model model) {
        List<Survey> surveyList = surveyManager.findAll();
        model.addAttribute("survey", surveyList);
        return "/survey/surveysToEdit";
    }


    @RequestMapping(value = {"/saveSurvey"}, method = RequestMethod.POST)
    public RedirectView saveAddTask(@ModelAttribute Survey newSurvey) {
        surveyManager.save(newSurvey);
        return new RedirectView("/editSurveys");
    }

}
