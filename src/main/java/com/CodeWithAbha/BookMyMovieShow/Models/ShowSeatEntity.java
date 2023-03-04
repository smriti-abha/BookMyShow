package com.CodeWithAbha.BookMyMovieShow.Models;



import com.CodeWithAbha.BookMyMovieShow.Enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Entity
@Table(name = "show_seats")
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ShowSeatEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String seatNo;
        @Enumerated(value = EnumType.STRING)
        private SeatType seatType;
        private boolean booked;
        private Date bookedAt;
        @ManyToOne
        @JoinColumn
        private ShowEntity show;
        @ManyToOne
        @JoinColumn
        private TicketEntity ticket;
}