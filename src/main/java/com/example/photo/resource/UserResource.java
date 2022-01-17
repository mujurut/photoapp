package com.example.photo.resource;

import com.example.photo.exception.RestrictedInfoException;
import com.example.photo.model.User;
import com.example.photo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody @Valid User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/find")
    public List<User> getByAddress(@RequestParam(name="address") String address) throws RestrictedInfoException {
        if(address.equalsIgnoreCase("area51"))
            throw new RestrictedInfoException();
        return userService.getByAddress(address);
    }

    @GetMapping("/find-by-id")
    public User getById(@RequestParam(name="userId") String userId){
        return userService.getById(userId);
    }
    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
//    public User getUser(){
//        return userService.getUser();
//    }
//

//
//    @GetMapping("/user/{userId}")
//    public User getUserById(@PathVariable("userId") int userId){
//        return userService.getUserById(userId);
//    }
//




}