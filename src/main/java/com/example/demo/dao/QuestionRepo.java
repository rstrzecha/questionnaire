package com.example.demo.dao;

import com.example.demo.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {


    void setSelection(String selection);



}
