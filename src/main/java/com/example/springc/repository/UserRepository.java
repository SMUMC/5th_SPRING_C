package com.example.springc.repository;

import com.example.springc.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JPA 상속
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
