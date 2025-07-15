package com.cineease.movie_booking.services;

import com.cineease.movie_booking.models.MovieEntity;

import java.util.List;

public interface MovieService  {
    List<MovieEntity> getAllMovies();
}
