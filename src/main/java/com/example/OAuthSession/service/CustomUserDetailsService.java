package com.example.OAuthSession.service;

import com.example.OAuthSession.dto.CustomUserDetails;
import com.example.OAuthSession.entity.MemberEntity;
import com.example.OAuthSession.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private MemberRepository memberRepository;
    @Override
    public UserDetails loadUserByUsername(String membername) throws UsernameNotFoundException {

        MemberEntity memberData = memberRepository.findByMembername(membername);

        if(memberData != null) {
            return new CustomUserDetails(memberData);
        }
        return null;
    }
}
