package com.example.demo.manager;

import com.example.demo.dao.UserRepo;
import com.example.demo.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {

    private UserRepo userRepo;

    @Autowired
    public UserManager(UserRepo userRepo) {this.userRepo=userRepo;}


    public Iterable<AppUser> findAll(){
        return userRepo.findAll();
    }

    public AppUser save(AppUser appUser){
        return userRepo.save(appUser);
    }

    public void deleteById(Long id){
        userRepo.deleteById(id);
    }


}
