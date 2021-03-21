package com.example.demo;



import com.example.demo.entity.Ankieta;
import com.example.demo.manager.AnkietaManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ankieta")
public class AnkietaApi {

    private AnkietaManager ankietaManager;

    @Autowired
    public AnkietaApi(AnkietaManager ankietaManager){
        this.ankietaManager=ankietaManager;
    }

    @GetMapping("/all")
    public Iterable<Ankieta> getAll(){
        return ankietaManager.findAll();
    }

    @PostMapping
    public Ankieta addAnkieta(@RequestBody Ankieta ankieta){
        return ankietaManager.save(ankieta);
    }

    @DeleteMapping
    public void deleteAnkieta(@RequestParam Long id){
        ankietaManager.deleteById(id);
    }




}
