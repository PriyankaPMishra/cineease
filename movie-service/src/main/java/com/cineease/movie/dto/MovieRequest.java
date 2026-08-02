package com.cineease.movie.dto;

import com.cineease.movie.model.enums.Genre;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record MovieRequest (

        @NotBlank(message = "Movie title is required")
        @Size(min = 1, max = 255, message = "Movie title must be between 1 and 255 characters")
        String movieTitle,

        @NotNull(message = "Genre is required")
        Genre genre,

        @NotBlank(message = "Language is required")
        @Size(max = 50, message = "Language must be less than 50 characters")
        String language,

        @NotNull(message = "Duration is required")
        @Min(value = 1, message = "Duration must be at least 1 minute")
        @Max(value = 500, message = "Duration cannot exceed 500 minutes")
        int durationMinutes,

        @NotNull(message = "Release date is required")
        @PastOrPresent(message = "Release date must be in the past or present")
        LocalDate releaseDate,

        @DecimalMin(value = "0.0", message = "Rating must be at least 0.0")
        @DecimalMax(value = "10.0", message = "Rating cannot exceed 10.0")
        double rating,

        @Size(max = 1000, message = "Description cannot exceed 1000 characters")
        String description,

        @Size(max = 500, message = "Poster URL cannot exceed 500 characters")
        @Pattern(regexp = "^(http|https)://.*$", message = "Poster URL must be a valid URL")
        String posterUrl,

        @Size(max = 500, message = "Trailer URL cannot exceed 500 characters")
        @Pattern(regexp = "^(http|https)://.*$", message = "Trailer URL must be a valid URL")
        String trailerUrl

) {
}