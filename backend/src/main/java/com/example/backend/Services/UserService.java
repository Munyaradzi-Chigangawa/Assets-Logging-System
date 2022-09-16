package com.example.backend.Services;

import com.example.backend.Models.User;
import com.example.backend.Repositories.UserRepository;
import com.example.backend.dto.UserDto;
import com.example.backend.exceptions.UserNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.security.SecureRandom;
import java.util.Base64;


@Transactional
@Service
@RequiredArgsConstructor

public class UserService {
    @Autowired
    private final UserRepository userRepository;
    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Base64.Encoder base64encoder = Base64.getUrlEncoder();

    // Save User
    public User save (UserDto user) {
        user.setToken(generateToken());
        User user1 = User.builder()
                .name(user.getName())
                .username(user.getUsername())
                .password(user.getPassword())
                .token(user.getToken())
                .build();

        return userRepository.save(user1);
    }
    // Generate Token
    private String generateToken() {
        byte[] token = new byte[24];
        secureRandom.nextBytes(token);
        return base64encoder.encodeToString(token);

    }
    //  Login
    public User login (UserDto user) {
        User user1 = userRepository.findUserByUsername(user.getUsername());
        if (user1 == null) {
            throw new UserNotFound("Sender not found");
        }
        if (user1.getPassword().equals(user.getPassword())) {
            return user1;
        }
        throw new UserNotFound("Invalid Password");
    }


    // Get User
    public User findById(Long userId) {
        return userRepository.findById(userId).orElseThrow(()-> new UserNotFound("Sender with ID "+userId+" was not found"));
    }
}
