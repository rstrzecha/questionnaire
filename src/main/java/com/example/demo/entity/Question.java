package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Question implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String text;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private int countOptionA;
    private int countOptionB;
    private int countOptionC;
    private int countOptionD;

    public int getCountOptionA() {
        return countOptionA;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountOptionA(int countOptionA) {
        this.countOptionA = countOptionA;
    }

    public int getCountOptionB() {
        return countOptionB;
    }

    public void setCountOptionB(int countOptionB) {
        this.countOptionB = countOptionB;
    }

    public int getCountOptionC() {
        return countOptionC;
    }

    public void setCountOptionC(int countOptionC) {
        this.countOptionC = countOptionC;
    }

    public int getCountOptionD() {
        return countOptionD;
    }

    public void setCountOptionD(int countOptionD) {
        this.countOptionD = countOptionD;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn/*(name = "survey_id")*/
    private Survey survey;

    //      @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
//      private Set<Answer> answers = new HashSet<>();
    public Question() {
    }

    public Question(String text, String optionA, String optionB, String optionC, String optionD) {
        this.text = text;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
    }

//    public Set<Answer> getAnswers() {
//        return answers;
//    }

//    public void setAnswer(Set<Answer> answers) {
//        this.answers = answers;
//    }


    public Long getId() {
        return id;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                '}';
    }
}
