package com.example.ex1.controller;

import com.example.ex1.entity.UserDto;
import com.example.ex1.service.UserServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserServiceInterface testServiceInterface;

    public UserController(UserServiceInterface testServiceInterface) {
        this.testServiceInterface = testServiceInterface;
    }

    @GetMapping("/first")
    public UserDto getStartPage(
            @RequestParam String name,
            @RequestParam String age
    ) {
        UserDto user = new UserDto();
        user.setName(name);
        user.setAge(age);

        return user;
    }

    @PostMapping("/create")
    public List<UserDto> createUser(
            @RequestBody UserDto user
    ) {
        List<UserDto> users = testServiceInterface.addNewUser(user);

        return users;
    }
}
