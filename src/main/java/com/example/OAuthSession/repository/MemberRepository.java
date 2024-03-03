package com.example.OAuthSession.repository;

import com.example.OAuthSession.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
    MemberEntity findByMembername(String membername);
    boolean existsByMembername(String membername);

}
