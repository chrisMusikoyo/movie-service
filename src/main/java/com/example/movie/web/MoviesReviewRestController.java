package com.example.movie.web;

import com.example.movie.domain.Movies;
import com.example.movie.domain.MoviesReview;
import com.example.movie.domain.dto.CreateMoviesDTO;
import com.example.movie.domain.dto.CreateMoviesReviewDTO;
import com.example.movie.services.MoviesReviewService;
import com.example.movie.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies-reviews")
public class MoviesReviewRestController {

    private final MoviesReviewService moviesReviewService;

    @Autowired
    public MoviesReviewRestController(MoviesReviewService moviesReviewService) {
        this.moviesReviewService = moviesReviewService;
    }

    @PostMapping
    public MoviesReview createMoviesReview(@RequestBody CreateMoviesReviewDTO createMoviesReviewDTO){

        return moviesReviewService.createMoviesReview(createMoviesReviewDTO);
    }

    @GetMapping
    public Page<MoviesReview> getMoviesReview(@PageableDefault(size = 20, sort = "createdon", direction = Sort.Direction.DESC) Pageable pageable){
        return  moviesReviewService.fetchMoviesReview(pageable);
    }

    @PatchMapping("/{movieReviewId}")
    public MoviesReview updateMovieReview(@PathVariable("movieReviewId") String movieId,
                              @RequestBody Movies updatedMovieReview) {
        return moviesReviewService.updateMovieReview( movieId, updatedMovieReview);
    }



}
