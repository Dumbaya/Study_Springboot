package com.example.study_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class MemberEntity {
    @Id
    private Long id;

}
