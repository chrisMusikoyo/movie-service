package com.example.movie.repositories;

import com.example.movie.domain.MoviesReview;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesReviewRepository extends JpaRepository<MoviesReview,Integer> {

    Page<MoviesReview> findAll(Pageable pageable);
}
