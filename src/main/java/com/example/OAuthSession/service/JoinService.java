package com.example.OAuthSession.service;

import com.example.OAuthSession.dto.JoinDTO;

import com.example.OAuthSession.entity.UserEntity2;

import com.example.OAuthSession.repository.UserRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private UserRepository2 userRepository2;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void joinProcess(JoinDTO joinDTO){


        // db에 이미 동일한 username을 가진 회원이 존재하는지?
        boolean isUser = userRepository2.existsByUsername2(joinDTO.getUsername2());
        if(isUser) {
            return;
        }

        UserEntity2 data2 = new UserEntity2();
        data2.setUsername2(joinDTO.getUsername2());
        data2.setPassword(bCryptPasswordEncoder.encode(joinDTO.getPassword()));
        data2.setRole("ROLE_ADMIN");
        userRepository2.save(data2);
    }
}
