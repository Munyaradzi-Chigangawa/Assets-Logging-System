package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserDto {
    @NotEmpty(message = "Username Required")
    private String username;
    @NotEmpty(message = "Name Required")
    private String name;
    @NotEmpty(message = "Password Required")
    private String password;
    private String token;
}
