package com.CodeWithAbha.BookMyMovieShow.Service;


import com.CodeWithAbha.BookMyMovieShow.Dtos.UserRequestDto;
import com.CodeWithAbha.BookMyMovieShow.Models.UserEntity;
import com.CodeWithAbha.BookMyMovieShow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto) {
        //converted userRequestDto to userEntity
        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();
        try {
            userRepository.save(userEntity);
        }catch(Exception e){
           return "user could not be added";
        }
        return "created User Successfully";
    }
}
