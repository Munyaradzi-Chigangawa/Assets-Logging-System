package com.example.backend.Services;
import com.example.backend.Models.User;
import com.example.backend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.SecureRandom;
import java.util.Base64;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final Base64.Encoder base64encoder = Base64.getUrlEncoder();
    public String register(User user) {
        // Check if user with provided name already exist or not
        if (checkUserExist(user) == true )
            return "Error while adding user";

        user.setToken(generateToken());

        userRepository.save(user);

        return "User Successfully Registered";

    }

    private String generateToken() {

        byte[] token = new byte[24];
        secureRandom.nextBytes(token);
        return base64encoder.encodeToString(token);

    }
    private boolean checkUserExist(User user) {
        User existingUser = userRepository.findById(user.getUsername()).orElse(null);

        if (existingUser == null)
            return false;
        return true;
    }
    public String login(User user) {

    }
}
