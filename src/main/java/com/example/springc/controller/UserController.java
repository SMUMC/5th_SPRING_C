package com.example.springc.controller;

import com.example.springc.dto.UserDTO;
import com.example.springc.entities.UserEntity;
import com.example.springc.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/users")
public class UserController {

    private final UserService userService;

    // C
    @PostMapping("/create")
    public ResponseEntity<UserEntity> create(@RequestBody UserDTO user) {
        log.info("GET /api/v1/users/create 요청처리 시작");
//        log.info("{}", new LogEntity(1L, "GET /api/v1/users/create", "요청처리 시작"));
        UserEntity newUser = null;
        try {
            newUser = userService.create(user);
        } catch (Exception e) {
            log.error("에러 발생" + e);
        }
        log.info("GET /api/v1/users/create 요청처리 완료 > 생성된 유저 : {}", newUser);
//        return ResponseEntity.ok("유저 생성 완료.");
        return ResponseEntity.ok(newUser);
    }
}
