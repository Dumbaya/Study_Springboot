package com.example.study_springboot.controller;

import com.example.study_springboot.dto.MemberDto;
import com.example.study_springboot.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class JoinController {

    private final MemberService memberService;
    @GetMapping("/join")
    public String join(){
        return "content/join";
    }

    @PostMapping("/join")
    public String createMember(MemberDto memberDto){
        Long id = memberService.join(memberDto);
        return "content/homepage";
    }
}
