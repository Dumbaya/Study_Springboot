package com.example.study_springboot.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column
    private String password;

    @Column(nullable = false, unique = true)
    private String email;
}
