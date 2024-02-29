package com.example.study_springboot.board;

import com.example.study_springboot.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
