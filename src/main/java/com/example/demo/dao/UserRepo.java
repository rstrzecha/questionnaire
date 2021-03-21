package com.example.demo.dao;

import com.example.demo.entity.Ankieta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Ankieta, Long> {
}
