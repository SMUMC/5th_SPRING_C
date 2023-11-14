package com.example.springc.converter;


import com.example.springc.dto.UserRes;
import com.example.springc.entities.UserEntity;

public class UserConverter {
    public static UserRes.UserJoinRes toUserDto(UserEntity user){

        // builder 패턴 이용
        return UserRes.UserJoinRes.builder()
                .email(user.getEmail())
                .name(user.getName())
                .status(user.getStatus())
                .build();
    }
}
