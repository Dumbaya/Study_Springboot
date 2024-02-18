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

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public void joinUser(User user){
        User existingUser = findByLoginId(user.getLoginId());

        if (existingUser != null){
            throw new IllegalArgumentException("이미 사용 중인 아이디입니다.");
        }

        existingUser = findByEmail(user.getEmail());

        if (existingUser != null){
            throw new IllegalArgumentException("이미 사용 중인 이메일입니다.");
        }

        userRepository.save(user);
    }

    public User loginUser(String loginId, String passsword){
        User user = findByLoginId(loginId);

        if(user==null){
            throw new IllegalArgumentException("해당 아이디로 가입된 사용자가 없습니다.");
        }

        if(!user.getPassword().equals(passsword)){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }

        return user;
    }
}
