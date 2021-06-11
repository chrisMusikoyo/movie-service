package com.example.movie.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
public class CreateMoviesDTO {


    private String title;
    private String description;
    private String user_id;
    private String createdon;
}
