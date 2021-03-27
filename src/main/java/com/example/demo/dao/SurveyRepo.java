package com.example.demo.dao;

import com.example.demo.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SurveyRepo extends JpaRepository<Survey, Long> {

    List<Survey> findByName(String name);


}
