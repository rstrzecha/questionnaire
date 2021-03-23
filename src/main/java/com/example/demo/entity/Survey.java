package com.example.demo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table
public class Survey implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;
    private String description;
    private LocalDate date;



    @OneToMany(mappedBy = "survey", fetch = FetchType.LAZY)
    private Set<Question> questions;

    public Survey() {
    }

    public Survey( String name, String description, LocalDate date){
        this.name = name;
        this.description = description;
        this.date = date;

    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return LocalDate.now() ;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
