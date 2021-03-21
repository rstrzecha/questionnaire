package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
public class Question implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String text;
    private boolean answer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ankieta_id", nullable = false)
    private Ankieta ankieta;

    public Question() {
    }

    public Question(String text, boolean answer, Ankieta ankieta) {
        this.text = text;
        this.answer = answer;
        this.ankieta = ankieta;
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
