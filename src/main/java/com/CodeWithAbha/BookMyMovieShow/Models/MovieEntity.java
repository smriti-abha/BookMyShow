package com.CodeWithAbha.BookMyMovieShow.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Table(name = "movies")  //show table name movies
@Entity   //for object in springboot
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,unique = true)
    private String movieName;
    private int duration;
    private Date releaseDate;
    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows;
}

