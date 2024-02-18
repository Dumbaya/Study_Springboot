package com.example.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/board/board")
    public String boardPage(){
        return "board/board";
    }
}
