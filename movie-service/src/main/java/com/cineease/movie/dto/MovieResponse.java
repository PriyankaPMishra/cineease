package com.cineease.movie.dto;

import com.cineease.movie.enums.Genre;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record MovieResponse (
        Long movieId,
        String movieTitle,
        Genre genre,
        String language,
        int durationMinutes,
        LocalDate releaseDate,
        Double rating,
        String description,
        String posterUrl,
        String trailerUrl,
        boolean isActive,
        LocalDateTime createdAt,
        LocalDateTime updatedAt

) {
}
