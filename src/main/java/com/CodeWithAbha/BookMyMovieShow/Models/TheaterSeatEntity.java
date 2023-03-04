package com.CodeWithAbha.BookMyMovieShow.Models;


import com.CodeWithAbha.BookMyMovieShow.Enums.SeatType;
import com.CodeWithAbha.BookMyMovieShow.Models.TheaterEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="theater_seats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,columnDefinition = "seat_no",nullable = false)
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    private int rate;
    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;
    public TheaterSeatEntity(String seatNo,SeatType seatType,int rate){
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.rate = rate;
    }
}
