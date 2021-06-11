package com.example.movie.services;

import com.example.movie.domain.Movies;
import com.example.movie.domain.MoviesReview;
import com.example.movie.domain.dto.CreateMoviesReviewDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MoviesReviewService {

    MoviesReview createMoviesReview(CreateMoviesReviewDTO createMoviesReviewDTO);

    Page<MoviesReview> fetchMoviesReview(Pageable pageable);

    MoviesReview updateMovieReview(String movieReviewId, Movies updatedMovieReview);
}
