//package com.cineease.movie.mapper;
//
//import com.cineease.movie.dto.MovieRequest;
//import com.cineease.movie.dto.MovieResponse;
//import com.cineease.movie.model.Movie;
//import org.mapstruct.*;
//
//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
//public interface MovieMapper {
//
//    Movie toEntity(MovieRequest request);
//
//    @Mapping(target = "movieId", source = "movieId")
//    MovieResponse toResponse(Movie movie);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateMovieFromRequest(MovieRequest request, @MappingTarget Movie movie);
//}