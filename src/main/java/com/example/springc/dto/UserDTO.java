package com.example.springc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Long userId;

    private String email;

    private String password;

    private String name;

    private char status;

    private String role;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
}
