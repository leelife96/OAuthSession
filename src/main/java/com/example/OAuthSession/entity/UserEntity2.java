package com.example.OAuthSession.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserEntity2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true) // username 중복 방지
    private String username2;

    private String password;
    private String role;
}
