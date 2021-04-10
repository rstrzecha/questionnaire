package com.example.demo.controller;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.dao.SurveyRepo;
import com.example.demo.entity.Survey;
import com.example.demo.manager.QuestionManager;
import com.example.demo.manager.SurveyManager;
import com.example.demo.dto.Answer;
import com.example.demo.model.AnswerForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SurveyController {

    private SurveyRepo surveyRepo;
    private SurveyManager surveyManager;

    private QuestionRepo questionRepo;
    private QuestionManager questionManager;

    private  AnswerForm answerForm;
   // private static List<Answer> answers = new ArrayList<Answer>();


    public SurveyController(SurveyRepo surveyRepo, SurveyManager surveyManager, QuestionRepo questionRepo,
                            QuestionManager questionManager) {
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
        model.addAttribute("questions", survey.getQuestions());
        model.addAttribute("answerForm", answerForm);
        return "/survey/doSurvey";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("answerForm") AnswerForm answerForm) {
       // System.out.println(answerForm);
       // System.out.println(answerForm.getAnswers());
        List<Answer> answers = answerForm.getAnswers();



        if (null != answers && answers.size() > 0) {
        //  SurveyController.answers = answers;
          //  SurveyController.answerForm = answerForm;
            for (Answer answer : answers) {
                System.out.printf("%s \t %s \n", answer.getQuestionId(),
                        answer.getSelection());

               //answer.setSelection(answer.getSelection());
            }
        }

        return new ModelAndView("/index", "answerForm",
                answerForm);


    }
}
