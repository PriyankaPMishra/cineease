package com.cineease.user.service;

import com.cineease.user.dto.AuthResponse;
import com.cineease.user.dto.LoginRequest;
import com.cineease.user.dto.RegisterRequest;
import com.cineease.user.model.User;
import com.cineease.user.model.enums.Role;
import com.cineease.user.repository.UserRepository;
import com.cineease.user.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthService {

    @Value("${jwt.expiration}")
    private Long expiration;

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthResponse register(RegisterRequest register) {
        User newUser = User.builder()
                .firstName(register.firstName())
                .lastName(register.lastName())
                .email(register.email())
                .password(passwordEncoder.encode(register.password()))
                .phone(register.phone())
                .role(register.role() != null ? register.role() : Role.USER)
                .build();

        userRepository.save(newUser);

        return new AuthResponse(
                jwtService.generateToken(newUser.getEmail(), newUser.getRole()),
                "Bearer",
                expiration
        );
    }
    
    public AuthResponse login(LoginRequest login) {
        User user = userRepository.findByEmail(login.email())
                .orElseThrow(() -> new BadCredentialsException("Invalid email or password"));

        if (!passwordEncoder.matches(login.password(), user.getPassword())) {
            throw new BadCredentialsException("Invalid email or password");
        }

        return new AuthResponse(
                jwtService.generateToken(user.getEmail(), user.getRole()),
                "Bearer", expiration);
    }
}
