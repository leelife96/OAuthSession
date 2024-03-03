package com.example.OAuthSession.service;

import com.example.OAuthSession.dto.CustomUserDetails;
import com.example.OAuthSession.entity.UserEntity2;
import com.example.OAuthSession.repository.UserRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository2 userRepository2;
    @Override
    public UserDetails loadUserByUsername(String username2) throws UsernameNotFoundException {

        UserEntity2 userData = userRepository2.findByUsername2(username2);

        if(userData != null) {
            return new CustomUserDetails(userData);
        }
        return null;
    }
}
