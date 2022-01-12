package com.example.photo.resource;

import com.example.photo.model.User;
import com.example.photo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(){
        return userService.getUser();
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/user/{userId}")
    public User getUserById(@PathVariable("userId") int userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/user/{userId}")
    public User updateUser(@PathVariable("userId") int userId, @RequestBody User user){
        return userService.updateUser(userId,user);
    }
    @GetMapping("/allUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


}