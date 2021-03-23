package com.example.demo.dao;

import com.example.demo.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SurveyRepo extends JpaRepository<Survey, Long> {

    Iterable<Survey> findByName(String name);


}
