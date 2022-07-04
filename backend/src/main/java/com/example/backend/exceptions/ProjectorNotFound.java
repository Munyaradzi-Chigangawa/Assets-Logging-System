package com.example.backend.exceptions;

public class ProjectorNotFound extends RuntimeException {
    public ProjectorNotFound(String message) {
        super(message);
    }
}
