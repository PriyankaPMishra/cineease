package com.cineease.user.dto;

import com.cineease.user.model.enums.Role;
import jakarta.validation.constraints.*;

public record RegisterRequest(
        @NotBlank(message = "Email is required")
        @Email(message = "Invalid email format")
        String email,

        @NotBlank(message = "Password is required")
        @Size(min = 8, max = 14, message = "Password must be between 8 and 14 characters")
        String password,

        @NotBlank(message = "First name is required")
        String firstName,

        @NotBlank(message = "Last name is required")
        String lastName,

        @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
        String phone,

        @NotBlank(message = "Role is required")
        Role role
) {
}
