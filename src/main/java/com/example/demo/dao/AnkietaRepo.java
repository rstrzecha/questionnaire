package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnkietaRepo extends JpaRepository<Ankieta, Long> {
}
