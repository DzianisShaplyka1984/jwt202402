package com.academy.jwt202402.dto;

import lombok.Data;

@Data
public class JwtRequestDto {
    private String userName;
    private String password;
}
