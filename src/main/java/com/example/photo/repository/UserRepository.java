package com.example.photo.repository;

import com.example.photo.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {


    List<User> userList = new ArrayList<>();
    public User getUser(){
        User user = new User("tino","zim",10);
        return user;
    }

    public User saveUser(User user){
        user.setUserId(userList.size()+1);
        userList.add(user);
        return user;
    }


    public User getUserById(int userId) {
        for(User user:userList){
            if(user.getUserId()==userId)return user;
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User updateUser(int userId, User user){
        for(User u: userList){
            if(u.getUserId()==userId){
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                u.setAge(user.getAge());
                return u;
            }
        }
        return null;
    }
}
