package com.cybersoft.demojpa.services;

import com.cybersoft.demojpa.entity.UserEntity;
import com.cybersoft.demojpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Phần này chỉ sử dụng xử lý logic code
public class UserService implements  UserServiceImplement {

    // Service sẽ gọi repository
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<UserEntity> getUserByEmailAndPassword(String email, String password) {
        return  userRepository.findByEmailAndPassword(email , password);
    }

}
