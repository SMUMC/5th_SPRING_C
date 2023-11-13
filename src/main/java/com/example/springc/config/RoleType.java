package com.example.springc.config;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum RoleType {

    USER(0, "USER"),
    MANAGER(1, "MANAGER");

    private final Integer value;
    private final String role;


    @JsonValue // 이걸 넣어주어야 함.
    public String getRole() {
        return role;
    }
}