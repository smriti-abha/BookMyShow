package com.CodeWithAbha.BookMyMovieShow.Repository;

import com.CodeWithAbha.BookMyMovieShow.Models.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
