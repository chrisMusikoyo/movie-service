package com.example.movie.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="movies")
@NoArgsConstructor
public class Movies  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String user_id;
    private String createdon;
  //  private List<MoviesReview> moviesReview;


}
