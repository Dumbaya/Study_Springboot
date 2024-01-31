package com.example.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class JoinController {
    @GetMapping("/join")
    public String join(){
        return "content/join";
    }
}
