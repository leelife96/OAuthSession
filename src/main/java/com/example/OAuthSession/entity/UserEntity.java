package com.example.OAuthSession.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;


    private String email;

    private String role;
}
