package com.example.demo.manager;

import com.example.demo.dao.Ankieta;
import com.example.demo.dao.AnkietaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AnkietaManager {

    private AnkietaRepo ankietaRepo;

    @Autowired
    public AnkietaManager(AnkietaRepo ankietaRepo) {this.ankietaRepo=ankietaRepo;}


    public Iterable<Ankieta> findAll(){
        return ankietaRepo.findAll();
    }

    public Ankieta save(Ankieta ankieta){
        return ankietaRepo.save(ankieta);
    }

    public void deleteById(Long id){
        ankietaRepo.deleteById(id);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Ankieta(1L,"Twoja opinia", "Podoba Ci sie nasze dzieło", "Tak", "Stanowcze raczej tak"));
        save(new Ankieta(2L,"Pytanie ogolne", "Jestes zadowolony z siebie", "Tak", "Stanowcze raczej tak"));
    }
}
