package com.example.photo.model;

import com.example.photo.validation.ValidName;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class User {
    @Id
    private String id;
    @NotEmpty @ValidName
    private String name;
    private String address;
    @Min(value=13)  @Max(value=150)
    private int age;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public User(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
}

