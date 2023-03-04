package com.CodeWithAbha.BookMyMovieShow.Controller;


import com.CodeWithAbha.BookMyMovieShow.Dtos.MovieRequestDto;
import com.CodeWithAbha.BookMyMovieShow.Service.MovieService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public String addMovie(@RequestBody() MovieRequestDto movieRequestDto){
      movieService.createMovie(movieRequestDto);
         return "movie added successfully";
    }
}
