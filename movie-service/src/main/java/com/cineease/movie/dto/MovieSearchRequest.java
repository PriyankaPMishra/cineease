package com.cineease.movie.dto;

import com.cineease.movie.enums.Genre;

import java.time.LocalDate;

public record MovieSearchRequest(
        String keyword,
        Genre genre,
        String language,
        LocalDate fromDate,
        LocalDate toDate,
        double minRating,
        boolean isActive,
        int page,
        int size
) {
}
