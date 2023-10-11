package com.example.springc.service;

import com.example.springc.config.RoleType;
import com.example.springc.dto.UserDTO;
import com.example.springc.entities.UserEntity;
import com.example.springc.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Slf4j // 로그 확인 위한 어노테이션
@Service // ㅁㅁㅁㅁㅁㅁㅁ
public class UserService {

    @Autowired
    private UserRepository userRepository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public UserEntity create(UserDTO user) {
        String encryptedPw = encoder.encode(user.getPassword());
        UserEntity newUser = UserEntity.builder()
                .email(user.getEmail())
                .password(encryptedPw)
                .name(user.getName())
                .status('A')
                .role(String.valueOf(RoleType.USER))
                .build();

        return userRepository.saveAndFlush(newUser);
    }
}
