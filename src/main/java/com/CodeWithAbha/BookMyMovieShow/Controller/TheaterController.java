package com.CodeWithAbha.BookMyMovieShow.Controller;


import com.CodeWithAbha.BookMyMovieShow.Dtos.TheaterRequestDto;
import com.CodeWithAbha.BookMyMovieShow.Service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public String addTheater(@RequestBody() TheaterRequestDto theaterRequestDto){
        return theaterService.createTheater(theaterRequestDto);

    }
}
