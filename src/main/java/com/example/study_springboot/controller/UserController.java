package com.example.study_springboot.controller;

import com.example.study_springboot.user.User;
import com.example.study_springboot.user.UserDto;
import com.example.study_springboot.user.UserService;
import jakarta.servlet.http.HttpSession;
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
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("userDTO") UserDto userDTO, HttpSession session, Model model) {
        try{
            User user = userService.loginUser(userDTO.getLoginId(), userDTO.getPassword());
            session.setAttribute("userId", user.getLoginId());
            return "redirect:/";
        } catch (IllegalArgumentException e){
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }

    @GetMapping("/join")
    public String joinPage(Model model) {
        model.addAttribute("user", new User());
        return "join";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute("user") User user, Model model) {
        try{
            userService.joinUser(user);
            return "redirect:/login";
        } catch (IllegalArgumentException e){
            model.addAttribute("error", e.getMessage());
            return "join";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
