package com.example.OAuthSession.service;

import com.example.OAuthSession.dto.JoinDTO;

import com.example.OAuthSession.entity.MemberEntity;
import com.example.OAuthSession.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

   @Autowired
   private MemberRepository memberRepository;

   @Autowired
   private BCryptPasswordEncoder bCryptPasswordEncoder;

   public void joinProcess(JoinDTO joinDTO){

      MemberEntity data = new MemberEntity();
      data.setMembername(joinDTO.getMembername());
      data.setPassword(bCryptPasswordEncoder.encode(joinDTO.getPassword()));
      data.setRole("ROLE_USER");

      memberRepository.save(data);
   }
}
