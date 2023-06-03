package com.cybersoft.haudevlearnstringboot.config;

import com.cybersoft.haudevlearnstringboot.model.UserModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@configuration : Khai báo cho string boot biết khi chạy ở tầng config phải quét và cấu hình
@Configuration
public class CustomConfig {

    @Bean
    public UserModel userModel(){
        UserModel userModel = new UserModel();
        userModel.setUsername("happham0312");
        userModel.setPassword("123123");
        return  userModel;
    }
}
