package com.CodeWithAbha.BookMyMovieShow.Service;


import com.CodeWithAbha.BookMyMovieShow.Dtos.TheaterRequestDto;
import com.CodeWithAbha.BookMyMovieShow.Enums.SeatType;
import com.CodeWithAbha.BookMyMovieShow.Models.TheaterEntity;
import com.CodeWithAbha.BookMyMovieShow.Models.TheaterSeatEntity;
import com.CodeWithAbha.BookMyMovieShow.Repository.TheaterRepository;
import com.CodeWithAbha.BookMyMovieShow.Repository.TheaterSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

    @Autowired
    TheaterSeatRepository theaterSeatRepository;

    public String createTheater(TheaterRequestDto theaterRequestDto){
        TheaterEntity theaterEntity=TheaterEntity.builder().name(theaterRequestDto.getName()).
                city(theaterRequestDto.getCity()).address(theaterRequestDto.getAddress()).build();
        List<TheaterSeatEntity> theaterSeatEntityList=createTheaterSeats();

        theaterEntity.setTheaterSeatEntityList(theaterSeatEntityList);  //this is the goal

        //for each theater seats we need to theater

        for(TheaterSeatEntity theaterSeats:theaterSeatEntityList){
         theaterSeats.setTheater(theaterEntity);

        }
        return "theater created Successfully";
    }

    private List<TheaterSeatEntity> createTheaterSeats(){
      List<TheaterSeatEntity> seats=new ArrayList<>();

      TheaterSeatEntity seatEntity1=new TheaterSeatEntity("1A",SeatType.CLASSIC,100);
        TheaterSeatEntity seatEntity2=new TheaterSeatEntity("2A",SeatType.CLASSIC,100);
        TheaterSeatEntity seatEntity3=new TheaterSeatEntity("3A",SeatType.CLASSIC,100);
        TheaterSeatEntity seatEntity4=new TheaterSeatEntity("4A",SeatType.CLASSIC,100);
        TheaterSeatEntity seatEntity5=new TheaterSeatEntity("5A",SeatType.CLASSIC,100);
        TheaterSeatEntity seatEntity6=new TheaterSeatEntity("6A",SeatType.CLASSIC,100);
        TheaterSeatEntity seatEntity7=new TheaterSeatEntity("7A",SeatType.CLASSIC,100);
        TheaterSeatEntity seatEntity8=new TheaterSeatEntity("8A",SeatType.PLATINUM,150);
        TheaterSeatEntity seatEntity9=new TheaterSeatEntity("9A",SeatType.PLATINUM,150);
        TheaterSeatEntity seatEntity10=new TheaterSeatEntity("10A",SeatType.PLATINUM,150);
        TheaterSeatEntity seatEntity11=new TheaterSeatEntity("11A",SeatType.PLATINUM,150);
        TheaterSeatEntity seatEntity12=new TheaterSeatEntity("12A",SeatType.PLATINUM,150);
        TheaterSeatEntity seatEntity13=new TheaterSeatEntity("13A",SeatType.PLATINUM,150);
        TheaterSeatEntity seatEntity14=new TheaterSeatEntity("14A",SeatType.PLATINUM,150);
        TheaterSeatEntity seatEntity15=new TheaterSeatEntity("15A",SeatType.PLATINUM,150);

        seats.add(seatEntity1);
        seats.add(seatEntity2);
        seats.add(seatEntity3);
        seats.add(seatEntity4);
        seats.add(seatEntity5);
        seats.add(seatEntity6);
        seats.add(seatEntity7);
        seats.add(seatEntity8);
        seats.add(seatEntity9);
        seats.add(seatEntity10);
        seats.add(seatEntity11);
        seats.add(seatEntity12);
        seats.add(seatEntity13);
        seats.add(seatEntity14);
        seats.add(seatEntity15);

        theaterSeatRepository.saveAll(seats);
     return seats;
    }
}
