package com.example.study_springboot.user;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    @NotBlank(message = "아이디 없습니다.")
    private String loginId;

    private String password;

    @NotBlank(message = "이메일이 없습니다.")
    private String email;
}
