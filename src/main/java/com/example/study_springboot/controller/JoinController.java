package com.example.study_springboot.controller;

import com.example.study_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RestController
@RequestMapping("/api/join")
public class JoinController {
    @Autowired
    private UserService userService;
    @GetMapping("/join")
    public String join(){
        return "content/join";
    }
}
