package com.example.movie.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name="movie_review")
@Entity
public class MoviesReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int user_id;
//    @ManyToOne
//    private Movies movie;
    private int movie_id;
    private String comment;
    private String rating;
    private String status;
    private String createdon;
}
