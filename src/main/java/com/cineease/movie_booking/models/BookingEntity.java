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
@Table(name = "bookings")
public class BookingEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingID;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "showID", nullable = false)
    private ShowEntity showEntity;

    @Column(name = "seats_booked", nullable = false)
    private int seatsBooked;

    @Column(name = "booking_time")
    private LocalDateTime bookingTime = LocalDateTime.now();
}
