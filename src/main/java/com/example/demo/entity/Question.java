package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "question")
public class Question implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String text;
    private boolean answer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "survey_id", nullable = false)
    private Question question;

    public Question() {
    }

    public Question(String text, Question question, boolean answer) {
        this.text = text;
        this.question = question;
        this.answer = answer;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

}
