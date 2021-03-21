package com.example.demo.dao;

import com.example.demo.entity.Ankieta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnkietaRepo extends CrudRepository<Ankieta, Long> {
}
