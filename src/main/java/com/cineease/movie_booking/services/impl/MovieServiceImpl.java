package com.cineease.movie_booking.services.impl;

import com.cineease.movie_booking.models.MovieEntity;
import com.cineease.movie_booking.repositories.MovieRepository;
import com.cineease.movie_booking.services.MovieService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MovieServiceImpl implements MovieService
{
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieEntity> getAllMovies() {
        return movieRepository.findAll();
    }
}
