package com.example.movie.repositories;

import com.example.movie.domain.Movies;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MoviesRepository extends JpaRepository<Movies, Integer> {

    Page<Movies> findAll(Pageable pageable);
}
