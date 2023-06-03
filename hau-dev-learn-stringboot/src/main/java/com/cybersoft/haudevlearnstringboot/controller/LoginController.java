package com.cybersoft.haudevlearnstringboot.controller;

import com.cybersoft.haudevlearnstringboot.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String loginPage () {
        return  "Login page";
    }

    // @RequestParams : Tham số sẽ là nhỏ lẻ
    // @RequestBody: Tham số sẽ là 1 json( Đối tượng)

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String username, @RequestParam String password){
        return  new ResponseEntity<>("Tham so truyen vào" + username + password , HttpStatus.OK);
    }

    @PostMapping("/signup")
    public  ResponseEntity<?> signup (@RequestBody UserModel model){
        System.out.println(model);
        return  new ResponseEntity<>("Model: " + model.getUsername()  , HttpStatus.OK);
    }
}
