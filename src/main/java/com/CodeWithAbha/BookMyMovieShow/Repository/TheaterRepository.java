package com.CodeWithAbha.BookMyMovieShow.Repository;

import com.CodeWithAbha.BookMyMovieShow.Dtos.TheaterRequestDto;
import com.CodeWithAbha.BookMyMovieShow.Models.TheaterEntity;
import com.CodeWithAbha.BookMyMovieShow.Models.TheaterSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}
