package com.example.movie.services;

import com.example.movie.domain.Movies;
import com.example.movie.domain.dto.CreateMoviesDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface MoviesService {

    Movies createMovies(CreateMoviesDTO createMoviesDTO);

    Page<Movies> fetchMovies(Pageable pageable);

    Movies updateMovie(String movieId, Movies updatedMovie);
}
