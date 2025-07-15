package com.cineease.movie_booking.repositories;

import com.cineease.movie_booking.models.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<TheatreEntity, Long> {
}
