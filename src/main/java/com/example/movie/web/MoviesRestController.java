package com.example.movie.web;

import com.example.movie.domain.Movies;
import com.example.movie.domain.dto.CreateMoviesDTO;
import com.example.movie.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MoviesRestController {

    private final MoviesService moviesService;

    @Autowired
    public MoviesRestController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @PostMapping
    public Movies createMovies(@RequestBody CreateMoviesDTO createMoviesDTO){

        return moviesService.createMovies(createMoviesDTO);
    }

    @GetMapping
    public Page<Movies> getMovies(@PageableDefault(size = 20, sort = "createdon", direction = Sort.Direction.DESC) Pageable pageable){
        return  moviesService.fetchMovies(pageable);
    }

    @PatchMapping("/{movieId}")
    public Movies updateMovie(@PathVariable("movieId") String movieId,
                         @RequestBody Movies updatedMovie) {
        return moviesService.updateMovie( movieId, updatedMovie);
    }


}
