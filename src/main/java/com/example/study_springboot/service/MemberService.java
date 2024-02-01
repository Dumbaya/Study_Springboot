package com.example.study_springboot.service;

import com.example.study_springboot.dto.MemberDto;
import com.example.study_springboot.entity.MemberEntity;
import com.example.study_springboot.repository.MemberRepository;

public interface MemberService {
    Long join(MemberDto memberDto);
}
