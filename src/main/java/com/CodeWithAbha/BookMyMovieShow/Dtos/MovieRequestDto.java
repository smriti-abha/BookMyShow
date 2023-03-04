package com.CodeWithAbha.BookMyMovieShow.Dtos;

import lombok.Data;

import java.util.Date;

@Data
public class MovieRequestDto {
    private String movieName;
   private Date releaseDate;
   private int duration;
}
