package com.cineease.user.model.enums;

public enum Role {
    USER,
    ADMIN,
    THEATRE_OWNER;

    public String authority() {
        return switch (this) {
            case USER -> "ROLE_USER";
            case ADMIN -> "ROLE_ADMIN";
            case THEATRE_OWNER -> "ROLE_THEATRE_OWNER";
        };
    }
}