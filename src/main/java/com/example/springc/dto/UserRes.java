package com.example.springc.dto;

import com.example.springc.entities.UserEntity;
import lombok.Getter;
import lombok.Setter;

public class UserRes {
    @Getter
    @Setter
    public static class UserJoinRes {
        private String email;
        private String name;
        private char status;

        public UserJoinRes(UserEntity user) {
            this.email = user.getEmail();
            this.name = user.getName();
            this.status = user.getStatus();
        }
    }
}
