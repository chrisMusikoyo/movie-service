package com.example.movie.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMoviesReviewDTO {

    private int user_id;
    private  int movie_id;
    private String comment;
    private String rating;
    private String status;

}
