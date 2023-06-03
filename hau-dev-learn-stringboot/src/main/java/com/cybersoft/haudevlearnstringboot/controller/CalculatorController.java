package com.cybersoft.haudevlearnstringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    // POST và GET mình đều lấy tham số thông qua Annonation @RequestParams

    @GetMapping("")
    public  String index(@RequestParam("soA") int numberA , @RequestParam("soB") int numberB){
        return  "Kết quả là " + ( numberA + numberB);
    }
}
