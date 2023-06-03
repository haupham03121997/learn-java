package com.cybersoft.haudevlearnstringboot.controller;

import com.cybersoft.haudevlearnstringboot.model.RoleModel;
import com.cybersoft.haudevlearnstringboot.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserModel userModel;

    @GetMapping
    public ResponseEntity<?> getUser (){

        List<RoleModel> listRole = new ArrayList<>();
        RoleModel roleModel = new RoleModel();

        roleModel.setId(1);
        roleModel.setName("ADMIN");

        RoleModel roleModel2 = new RoleModel();

        roleModel2.setId(1);
        roleModel2.setName("USER");

        listRole.add(roleModel);
        listRole.add(roleModel2);

        userModel.setListRole(listRole);

        return  new ResponseEntity<>(userModel , HttpStatus.OK);
    }
}
