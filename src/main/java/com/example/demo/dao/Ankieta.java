package com.example.demo.dao;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ankieta {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long id;
    private String titel;
    private String question;
    private String answers1;
    private String answers2;


    public Ankieta() {
    }

    public Ankieta(Long id, String titel, String question, String answers1, String answers2) {
        this.id = id;
        this.titel = titel;
        this.question = question;
        this.answers1 = answers1;
        this.answers2 = answers2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswers1() {
        return answers1;
    }

    public void setAnswers1(String answers1) {
        this.answers1 = answers1;
    }

    public String getAnswers2() {
        return answers2;
    }

    public void setAnswers2(String answers2) {
        this.answers2 = answers2;
    }
}
//Ankieta powinna zawierac tytuł opis pytania odpowiedzi
// (opcjonalnie) pytania otwarte data utworzenia(opcjonalnie)
// data wygaśnięcialink (unikatowy link,
// identyfikator ankiety; jakiś hash)