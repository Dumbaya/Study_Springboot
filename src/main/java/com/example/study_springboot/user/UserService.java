package com.example.study_springboot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByLoginId(String loginId) {
        return userRepository.findByLoginId(loginId);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
