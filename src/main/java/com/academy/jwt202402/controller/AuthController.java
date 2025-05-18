package com.academy.jwt202402.controller;

import com.academy.jwt202402.dto.JwtRequestDto;
import com.academy.jwt202402.dto.JwtResponseDto;
import com.academy.jwt202402.util.JwtTokenUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final JwtTokenUtil jwtTokenUtil;
    private final AuthenticationManager authenticationManager;

    @PostMapping(value = "/auth")
    public JwtResponseDto auth(@RequestBody JwtRequestDto request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUserName(),
                                                        request.getPassword()));

        String token = jwtTokenUtil.generateToken(request.getUserName());

        return new JwtResponseDto(token);
    }
}
