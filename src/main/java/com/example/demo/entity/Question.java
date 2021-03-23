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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "survey_id")
    private Survey survey;


    /*  @OneToMany(mappedBy = "questions", fetch = FetchType.LAZY)
      private Set<Answer> answers;
  */
    public Question() {
    }

    public Question(String text, String optionA, String optionB, String optionC, String optionD) {
        this.text = text;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
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


}