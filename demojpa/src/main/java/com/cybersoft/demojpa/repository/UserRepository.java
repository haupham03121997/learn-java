package com.cybersoft.demojpa.repository;

import com.cybersoft.demojpa.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity , Integer > {
    List<UserEntity> findByEmailAndPassword(String email , String password);
}
