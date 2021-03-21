package com.example.demo.manager;

import com.example.demo.dao.AnkietaRepo;
import com.example.demo.entity.Ankieta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    private AnkietaRepo ankietaRepo;

    @Autowired
    public UserManager(AnkietaRepo ankietaRepo) {this.ankietaRepo=ankietaRepo;}


    public Iterable<Ankieta> findAll(){
        return ankietaRepo.findAll();
    }

    public Ankieta save(Ankieta ankieta){
        return ankietaRepo.save(ankieta);
    }

    public void deleteById(Long id){
        ankietaRepo.deleteById(id);
    }


}
