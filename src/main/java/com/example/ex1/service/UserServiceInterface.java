package com.example.ex1.service;

import com.example.ex1.entity.UserDto;

import java.util.List;

public interface UserServiceInterface {
    List<UserDto> addNewUser(UserDto user);
}
