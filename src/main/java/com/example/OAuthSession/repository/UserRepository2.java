package com.example.OAuthSession.repository;

import com.example.OAuthSession.entity.UserEntity2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository2 extends JpaRepository<UserEntity2, Integer> {

    boolean existsByUsername2(String username2);
    UserEntity2 findByUsername2(String username2);
}
