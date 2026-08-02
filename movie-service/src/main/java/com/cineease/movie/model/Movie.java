package com.cineease.movie.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "movies")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    @Column(nullable = false, length = 255)
    private String movieTitle;

    @Column(nullable = false, length = 100)
    private String genre;

    @Column(length = 50)
    private String language;

    private int durationMinutes;

    private LocalDate releaseDate;

    @Column(precision = 3, scale = 1)
    private double rating;

    @Column(length = 1000)
    private String description;

    @Column(length = 500)
    private String posterUrl;

    @Column(length = 500)
    private String trailerUrl;

    @Builder.Default
    private boolean isActive = true;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}