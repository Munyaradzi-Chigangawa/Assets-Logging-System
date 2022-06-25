package com.example.backend.Controllers;

import com.example.backend.Models.User;
import com.example.backend.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String Register(@RequestBody User user) {
        String result = authService.register(user);
        return result;
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {
    String token = authService.login(user);
    return token;
    }
}
