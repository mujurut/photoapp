package com.example.photo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.photo.model.User;

import java.util.List;
public interface UserRepository extends MongoRepository<User,String> {
    List<User> findAllByAddress(String address);
}
