package com.example.backend.exceptions;

public class LaptopNotFound extends RuntimeException {
    public LaptopNotFound(String message) {
        super(message);
    }
}
