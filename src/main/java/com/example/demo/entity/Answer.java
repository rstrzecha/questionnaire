package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Answer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(length=10)
    private String Selection;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id")
    private Question question;


    public Answer(String selection) {
        Selection = selection;
    }

    public Answer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSelection() {
        return Selection;
    }

    public void setSelection(String selection) {
        Selection = selection;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", Selection='" + Selection + '\'' +
                '}';
    }
}
