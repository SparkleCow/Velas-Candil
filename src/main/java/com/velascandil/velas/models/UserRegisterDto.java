package com.velascandil.velas.models;

public record UserRegisterDto(
        String username,
        String firstsName,
        String lastName,
        String password,
        String email
) {
}
