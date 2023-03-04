package com.CodeWithAbha.BookMyMovieShow.Service;


import com.CodeWithAbha.BookMyMovieShow.Dtos.MovieRequestDto;
import com.CodeWithAbha.BookMyMovieShow.Models.MovieEntity;
import com.CodeWithAbha.BookMyMovieShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String createMovie(MovieRequestDto movieRequestDto){
        try{
            MovieEntity movieEntity=MovieEntity.builder().movieName(movieRequestDto.getMovieName()).
                    releaseDate(movieRequestDto.getReleaseDate()).duration(movieRequestDto.getDuration()).build();
            movieRepository.save(movieEntity);

        }catch(Exception e){
          return "movie could not be added";
        }
        return "movie created Successfully";
    }
}
