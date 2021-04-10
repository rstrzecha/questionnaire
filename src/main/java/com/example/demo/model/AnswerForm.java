package com.example.demo.model;


import com.example.demo.dto.Answer;

import java.util.List;


public class AnswerForm {


    private List<Answer> answers;

    public List<Answer> getAnswers() {
        return answers;
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
