package com.example.ex1.service.impl;

import com.example.ex1.entity.UserDto;
import com.example.ex1.service.UserServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface {
    List<UserDto> users = new ArrayList<>();

    @Override
    public List<UserDto> addNewUser(UserDto user) {
        users.add(user);

        return users;
    }
}
