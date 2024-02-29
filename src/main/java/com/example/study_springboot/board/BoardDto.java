package com.example.study_springboot.board;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
    @NotBlank(message = "제목이 없습니다.")
    private String title;

    private String date;

    private int views;
}
