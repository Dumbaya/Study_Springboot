package com.example.study_springboot.board;

import com.example.study_springboot.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratedColumn;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "boards")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;

    private String title;

    private String date;

    private int views;

    @ManyToOne
    @JoinColumn(name = "user_loginid", referencedColumnName = "loginid")
    private User user;


}
