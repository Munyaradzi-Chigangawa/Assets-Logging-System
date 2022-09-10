package com.example.backend.Models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder

public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 100,name = "user_id")
    private Long userId;
    private String username;
    private String name;
    private String password;
    private String token;

}
