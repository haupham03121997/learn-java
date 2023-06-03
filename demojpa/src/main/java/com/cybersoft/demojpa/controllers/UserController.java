package com.cybersoft.demojpa.controllers;

import com.cybersoft.demojpa.entity.UserEntity;
import com.cybersoft.demojpa.services.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImplement userServiceImplement;

    @GetMapping("")
    public ResponseEntity<?> getAllUser(){
        List<UserEntity> list = userServiceImplement.getAllUser();
        for (UserEntity  item : list){
            System.out.println(item.getFullName());
        }
        return  new ResponseEntity<>("" , HttpStatus.OK);
    }

    @PostMapping("")
    public  ResponseEntity<?> getUserByEmailAndPassword(@RequestParam String email , @RequestParam String password){
        List<UserEntity> list = userServiceImplement.getUserByEmailAndPassword(email , password);
        for (UserEntity  item : list){
            System.out.println(item.getFullName());
        }
        return  new ResponseEntity<>("" , HttpStatus.OK);
    }
}
