package com.example.ex1.service.impl;

import com.example.ex1.model.User;
import com.example.ex1.service.TestServiceInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImp implements TestServiceInterface {
    List<User> users = new ArrayList<>();

    @Override
    public List<User> addNewUser(User user) {
        users.add(user);

        return users;
    }
}
