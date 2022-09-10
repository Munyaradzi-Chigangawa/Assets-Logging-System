package com.example.backend.Controllers;


import com.example.backend.Models.User;
import com.example.backend.Services.UserService;
import com.example.backend.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("api/v1")
    @CrossOrigin(value = "*", allowedHeaders = "*")
    @RequiredArgsConstructor
    @Slf4j

    public class UserController {

        private final UserService userService;

        // Create Sender Endpoint
        @PostMapping( value = "/addUser")
        public ResponseEntity <User> addUser (@RequestBody UserDto user) {
            log.info("User Added.");
            return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
        }

        // Login Endpoint
        @PostMapping( value = "/login")
        public ResponseEntity <User> login (@RequestBody UserDto user) {
            log.info("User Logged In.");
            return new ResponseEntity<>(userService.login(user), HttpStatus.OK);
        }
    }

