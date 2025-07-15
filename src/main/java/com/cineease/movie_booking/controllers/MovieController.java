package com.cineease.movie_booking.controllers;

import com.cineease.movie_booking.models.MovieEntity;
import com.cineease.movie_booking.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController
{
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieEntity> getALlMovies(){
        return movieService.getAllMovies();
    }
}
