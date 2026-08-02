package com.cineease.user.dto;

public record AuthResponse(
        String token,
        String tokenType,
        Long expiresIn
) {
}
