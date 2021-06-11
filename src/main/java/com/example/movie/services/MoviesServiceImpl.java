package com.example.movie.services;

import com.example.movie.domain.Movies;
import com.example.movie.domain.dto.CreateMoviesDTO;
import com.example.movie.jwt.JwtUserDetailsService;
import com.example.movie.repositories.MoviesRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class MoviesServiceImpl implements MoviesService{

    private final MoviesRepository moviesRepository;
    private final JwtUserDetailsService jwtUserDetailsService;

    public MoviesServiceImpl(MoviesRepository moviesRepository, JwtUserDetailsService jwtUserDetailsService) {
        this.moviesRepository = moviesRepository;
        this.jwtUserDetailsService = jwtUserDetailsService;
    }

    @Override
    public Movies createMovies(CreateMoviesDTO createMoviesDTO) {

        try {
            System.out.println("movie saving..."+new ObjectMapper().writeValueAsString(createMoviesDTO));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }



        Movies movies =new Movies();
        movies.setTitle(createMoviesDTO.getTitle());
        movies.setDescription(createMoviesDTO.getDescription());
        movies.setUser_id(createMoviesDTO.getUser_id());
        movies.setCreatedon(createMoviesDTO.getCreatedon());
        return moviesRepository.save(movies);


    }



    @Override
    public Page<Movies> fetchMovies(Pageable pageable) {
        return moviesRepository.findAll(pageable);
    }

    @Override
    public Movies updateMovie(String movieId, Movies updatedMovie) {
//        Movies foundmovie=moviesRepository.findMoviesById(movieId);
        return moviesRepository.save(updatedMovie);
    }
}
