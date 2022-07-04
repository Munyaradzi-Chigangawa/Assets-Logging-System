package com.example.backend.exceptions;

public class PersonNotFound extends RuntimeException{
    public PersonNotFound(String message) {
        super(message);
    }
}
