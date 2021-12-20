package com.example.photo.repository;

import com.example.photo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user = new User("tino","zim",10);
        return user;
    }
}
