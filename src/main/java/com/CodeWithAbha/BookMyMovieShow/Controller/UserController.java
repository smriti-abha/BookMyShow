package com.CodeWithAbha.BookMyMovieShow.Controller;

import com.CodeWithAbha.BookMyMovieShow.Dtos.UserRequestDto;
import com.CodeWithAbha.BookMyMovieShow.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody()UserRequestDto userRequestDto){
     return userService.createUser(userRequestDto);

    }


}
