package com.example.study_springboot.service;

import com.example.study_springboot.dto.UserDto;
import com.example.study_springboot.entity.UserEntity;
import com.example.study_springboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(UserDto userDto){
        UserEntity user = new UserEntity();
        user.setUsername(UserDto.getUsername());
        user.setPassword(UserDto.getPassword());
        user.setEmail(UserDto.getEmail());
        return userRepository.save(user);
    }
}
