package com.example.demo.controller;

import com.example.demo.dao.QuestionRepo;
import com.example.demo.dao.SurveyRepo;
import com.example.demo.entity.Question;
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
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
        List<Answer> answers = answerForm.getAnswers();

        if (null != answers && answers.size() > 0) {
            for (Answer answer : answers) {
                System.out.printf("%s \t %s \n", answer.getQuestionId(),
                        answer.getSelection());

                    questionManager.setSelection(Long.parseLong(answer.getQuestionId()), answer.getSelection());
            }
        }
        return new ModelAndView("/index", "answerForm",
                answerForm);
    }

    @RequestMapping(value = {"/surveysToEdit"}, method = RequestMethod.GET)
    public String getSurveysToEdit(Model model) {
        List<Survey> surveyList = surveyManager.findAll();
        model.addAttribute("survey", surveyList);
        return "/survey/surveysToEdit";
    }

    @RequestMapping(value = {"/saveSurvey"}, method = RequestMethod.POST)
    public RedirectView saveAddSurvey(@ModelAttribute Survey newSurvey) {
        surveyManager.save(newSurvey);
        return new RedirectView("/surveysToEdit");
    }

    @RequestMapping(value = {"/editSurvey/{id}"}, method = RequestMethod.GET)
    public String getEditTasks(Model model, @PathVariable String id) {
        Survey survey = surveyManager.findById(Long.parseLong(id)).get();

        model.addAttribute("survey", survey);
        model.addAttribute("questions", survey.getQuestions());
        return "survey/editSurvey";
    }

    @RequestMapping(value = {"/deleteSurvey/{surveyId}"}, method = RequestMethod.POST)
    public RedirectView deleteSurvey(@ModelAttribute Question newQuestion,
                                       @PathVariable("surveyId") Long surveyId) {

        Survey surveyToDelete = surveyManager.findById(surveyId).get();
        Set<Question> questions = surveyToDelete.getQuestions();
        for (Question question: questions) {
            questionManager.deleteById(question.getId());
        }
        surveyManager.deleteById(surveyId);
        return new RedirectView("/surveysToEdit");
    }

    @RequestMapping(value = {"/surveysList"}, method = RequestMethod.GET)
    public String getStatsSurveys(Model model) {
        List<Survey> surveyList = surveyManager.findAll();
        model.addAttribute("survey", surveyList);
        return "/results/surveysList";
    }

    @RequestMapping(value = {"/surveyStats/{id}"}, method = RequestMethod.GET)
    public String getSurveyStats(Model model, @PathVariable String id) {
        Survey survey = surveyManager.findById(Long.parseLong(id)).get();

        model.addAttribute("survey", survey);
        model.addAttribute("questions", survey.getQuestions());
        model.addAttribute("answerForm", answerForm);
        return "/results/surveyStats";
    }

}
