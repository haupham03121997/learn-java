package com.cybersoft.demojpa.services;

import com.cybersoft.demojpa.entity.UserEntity;

import java.util.List;


public interface UserServiceImplement {
    List<UserEntity> getAllUser();
    List<UserEntity> getUserByEmailAndPassword(String email , String password);
}
