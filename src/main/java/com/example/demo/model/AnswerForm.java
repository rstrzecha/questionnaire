package com.example.demo.model;


import com.example.demo.manager.QuestionManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerForm {
    QuestionManager questionManager;

    private List<Answer> answers;

    public List<Answer> getAnswers() {
        return answers;
    }

   public void setSelection(String selection) {
        questionManager.setSelection(selection);

    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "AnswerForm{" +
                "answers=" + answers +
                '}';
    }
}
