package com.kenchow.empolyeeapp.service;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException (String message) {
        super(message);
    }

}
