package com.velascandil.velas.models;

public record UserUpdateDto(
        String username,
        String firstsName,
        String lastName,
        String password
) {
}
