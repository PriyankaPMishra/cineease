package com.cineease.movie_booking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "theatres")
public class TheatreEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theatre_id")
    private Long theatreId;

    @Column(name = "theatre_name", nullable = false)
    private String theatreName;

    private String location;

    @Column(name = "total_seats")
    private int totalSeats;

    @OneToMany(mappedBy = "theatreEntity", cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList;
}
