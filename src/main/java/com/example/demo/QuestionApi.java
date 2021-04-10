/*
package com.example.demo;


import com.example.demo.entity.Question;
import com.example.demo.manager.QuestionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("question")
public class QuestionApi {

    private QuestionManager questionManager;

    @Autowired
    public QuestionApi(QuestionManager questionManager){
        this.questionManager = questionManager;
    }

    @GetMapping("/all")
    public Iterable<Question> getAll(){
        return questionManager.findAll();
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionManager.save(question);
    }

    @DeleteMapping
    public void deleteQuestion(@RequestParam Long id){
        questionManager.deleteById(id);
    }



}
*/
