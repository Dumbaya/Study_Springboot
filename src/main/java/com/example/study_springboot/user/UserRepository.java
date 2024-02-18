package com.example.study_springboot.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLoginId(String loginId);
    User findByEmail(String email);
}
