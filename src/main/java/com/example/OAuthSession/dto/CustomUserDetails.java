package com.example.OAuthSession.dto;

import com.example.OAuthSession.entity.UserEntity2;
import com.example.OAuthSession.repository.UserRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private UserEntity2 userEntity2;

    public CustomUserDetails(UserEntity2 userEntity2){
        this.userEntity2 = userEntity2;
    }

    @Autowired
    private UserRepository2 userRepository2;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new ArrayList<>();

        collection.add(new GrantedAuthority() {

            @Override
            public String getAuthority() {

                return userEntity2.getRole();
            }
        });

        return collection;
    }

    @Override
    public String getPassword() {
        return userEntity2.getPassword();
    }

    @Override
    public String getUsername() {
        return userEntity2.getUsername2();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
