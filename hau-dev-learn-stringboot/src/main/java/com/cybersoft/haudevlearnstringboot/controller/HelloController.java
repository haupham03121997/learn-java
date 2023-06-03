package com.cybersoft.haudevlearnstringboot.controller;

import com.cybersoft.haudevlearnstringboot.model.UserModel;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Annotation : @
* @Controller : Trả về giao diện thông báo cho string boot biết class dùng để định nghĩa đường dẫn có trả về giao diện
* @Restbody: Chỉ trả về text
* @RestController : Định nghĩa đường dẫn chỉ trả về text
*
*
*
*
* */
@RestController
@RequestMapping("/hello")

public class HelloController {

    @Autowired // Lấy class lưu trữ trên IOC xuống sử dụng
//    @Qualifier("ten_bean") Lấy class có tên bean được chỉ định trên IOC (có 2 bean giống nhau)
    UserModel userModel;

    // hello
    @GetMapping("")

    public ResponseEntity<UserModel> helloWorld(){
        return  new ResponseEntity<>(userModel , HttpStatus.OK);
    }

    @GetMapping("/user")
    public  String helloUser () {
        return  "Hello user";
    }

    @GetMapping("/calculator")
    public  int calculator(String numberA , String numberB) {
        return  Integer.parseInt(numberA) + Integer.parseInt(numberB);
    }


}
