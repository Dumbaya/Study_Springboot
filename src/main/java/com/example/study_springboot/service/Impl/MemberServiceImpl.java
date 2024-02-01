package com.example.study_springboot.service.Impl;

import com.example.study_springboot.dto.MemberDto;
import com.example.study_springboot.entity.MemberEntity;
import com.example.study_springboot.repository.MemberRepository;
import com.example.study_springboot.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public Long join(MemberDto memberDto){
        MemberEntity memberEntity = MemberEntity.builder()
                .username(memberDto.getUsername())
                .password(memberDto.getPassword())
                .email(memberDto.getEmail())
                .build();

        return memberRepository.save(memberEntity).getId();
    }
}
