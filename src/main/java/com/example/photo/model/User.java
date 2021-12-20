package com.example.photo.model;

public class User {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
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
