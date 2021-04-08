package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Answer {

    private String questionId;
    private String selection;

    public Answer() {
    }

    public Answer(String questionId, String selection) {
        this.questionId = questionId;
        this.selection = selection;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "questionId='" + questionId + '\'' +
                ", selection='" + selection + '\'' +
                '}';
    }
}
