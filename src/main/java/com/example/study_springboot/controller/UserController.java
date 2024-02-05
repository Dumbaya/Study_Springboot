package com.example.study_springboot.controller;

import com.example.study_springboot.user.User;
import com.example.study_springboot.user.UserDto;
import com.example.study_springboot.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("userDTO", new UserDto());
        return "../static/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("userDTO") UserDto userDTO, Model model) {
        User user = userService.findByLoginId(userDTO.getLoginId());
        if (user != null && user.getPassword().equals(userDTO.getPassword())) {
            // 로그인 성공
            return "redirect:/"; // 로그인 후 홈페이지로 리다이렉트
        } else {
            // 로그인 실패
            model.addAttribute("error", "Invalid login credentials");
            return "../static/login"; // 로그인 페이지 유지
        }
    }

    @GetMapping("/join")
    public String joinPage(Model model) {
        model.addAttribute("user", new User());
        return "../static/join";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/login";
    }
}