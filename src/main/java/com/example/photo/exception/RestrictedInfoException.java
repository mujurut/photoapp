package com.example.photo.exception;

public class RestrictedInfoException extends Exception {
    @Override
    public String getMessage(){
        return "Classified info";//super.getMessage();
    }
}

