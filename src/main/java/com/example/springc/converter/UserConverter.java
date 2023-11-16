package com.example.springc.converter;


import com.example.springc.config.RoleType;
import com.example.springc.dto.UserReq;
import com.example.springc.dto.UserRes;
import com.example.springc.entities.UserEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserConverter {

    private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static UserEntity toUser(UserReq.UserJoinReq userJoinReq) {
        String encryptedPw = encoder.encode(userJoinReq.getPassword());
        return UserEntity.builder()
                .email(userJoinReq.getEmail())
                .password(encryptedPw)
                .name(userJoinReq.getName())
//                .status('A') // @ColumnDefault 이용
                .role(RoleType.USER) // @ColumnDefault 이용
                .build();
    }
    public static UserRes.UserJoinRes toUserDto(UserEntity user){

        // builder 패턴 이용
        return UserRes.UserJoinRes.builder()
                .email(user.getEmail())
                .name(user.getName())
                .status(user.getStatus())
                .role(user.getRole())
                .build();
    }
}
