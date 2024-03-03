package com.example.OAuthSession.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String membername;

    private String password;
    private String role;
}
