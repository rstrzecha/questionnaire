package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Answer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String Selection;
   /* @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id")
    private Question question;
*/
    public Answer() {

    }

    public Answer(String selection) {
        Selection = selection;
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
}
