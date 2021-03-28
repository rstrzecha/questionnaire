//package com.example.demo;
//
//import com.example.demo.entity.Answer;
//import com.example.demo.manager.AnswerManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("answer")
//public class AnswerApi {
//
//    private AnswerManager answerManager;
//
//    @Autowired
//    public AnswerApi(AnswerManager answerManager){
//        this.answerManager = answerManager;
//    }
//
//    @GetMapping("/all")
//    public Iterable<Answer> getAll(){
//        return answerManager.findAll();
//    }
//
//    @PostMapping("/add")
//    public Answer addAnswer(@RequestBody Answer answer){
//        return answerManager.save(answer);
//    }
//
//    @DeleteMapping("/delete")
//    public void deleteAnswer(@RequestParam Long id){
//        answerManager.deleteById(id);
//    }
//
//
//
//}
