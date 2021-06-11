package com.example.movie.services;

import com.example.movie.domain.Movies;
import com.example.movie.domain.MoviesReview;
import com.example.movie.domain.dto.CreateMoviesReviewDTO;
import com.example.movie.repositories.MoviesReviewRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MoviesReviewServiceImpl implements MoviesReviewService{

    private final MoviesReviewRepository moviesReviewRepository;

    public MoviesReviewServiceImpl(MoviesReviewRepository moviesReviewRepository) {
        this.moviesReviewRepository = moviesReviewRepository;
    }
    @Override
    public MoviesReview createMoviesReview(CreateMoviesReviewDTO createMoviesReviewDTO) {

        MoviesReview moviesReview =new MoviesReview();
        moviesReview.setUser_id(createMoviesReviewDTO.getUser_id());
        moviesReview.setComment(createMoviesReviewDTO.getComment());
        moviesReview.setRating(createMoviesReviewDTO.getRating());
        moviesReview.setStatus(createMoviesReviewDTO.getStatus());
        moviesReview.setMovie_id(createMoviesReviewDTO.getMovie_id());

        return moviesReviewRepository.save(moviesReview);
    }

    @Override
    public Page<MoviesReview> fetchMoviesReview(Pageable pageable) {
        return moviesReviewRepository.findAll(pageable);
    }

    @Override
    public MoviesReview updateMovieReview(String movieReviewId, Movies updatedMovieReview) {
        return null;
    }
}
