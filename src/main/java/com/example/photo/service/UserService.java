package com.example.photo.service;

import com.example.photo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.photo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser( User user) {
        return userRepository.save(user);
    }

    public List<User> getByAddress(String address) {
        return userRepository.findAllByAddress(address);
    }

    public User getById(String userId) {
        return userRepository.findById(userId).get();
    }
//    public User getUser(){
//        return userRepository.getUser();
//    }
//

//

//    public User getUserById( int userId){
//        return userRepository.getUserById(userId);
//    }
//

}
