package com.example.movie.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int trials;
    private String guiId;
}
