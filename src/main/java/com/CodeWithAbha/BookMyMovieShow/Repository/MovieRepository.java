package com.CodeWithAbha.BookMyMovieShow.Repository;

import com.CodeWithAbha.BookMyMovieShow.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
}
