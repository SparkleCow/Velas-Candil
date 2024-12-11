package com.velascandil.velas.controllers;

import com.velascandil.velas.models.UserLoginDto;
import com.velascandil.velas.models.UserResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/auth")
public class AuthController {

    @PostMapping
    public ResponseEntity<UserResponseDto> login(@RequestBody UserLoginDto userLoginDto){

    }
}
