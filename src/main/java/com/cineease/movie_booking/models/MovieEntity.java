package com.cineease.movie_booking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")

public class MovieEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieID;

    @Column(name = "movie_title", nullable = false)
    private String movieTitle;

    private String genre;

    private String language;

    @Column(name = "duration_minutes")
    private int durationMinutes;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    private double rating;

    @OneToMany(mappedBy = "movieEntity", cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList;
}
