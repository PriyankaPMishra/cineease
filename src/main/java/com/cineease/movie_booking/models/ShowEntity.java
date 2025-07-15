package com.cineease.movie_booking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shows")
public class ShowEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private Long showID;

    @ManyToOne
    @JoinColumn(name = "movieID", nullable = false)
    private MovieEntity movieEntity;

    @ManyToOne
    @JoinColumn(name = "theatreID", nullable = false)
    private TheatreEntity theatreEntity;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    private double price;

    @Column(name = "available_seats")
    private int availableSeats;
}
