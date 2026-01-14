package com.example.ex1.controller;

import com.example.ex1.model.User;
import com.example.ex1.service.TestServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private final TestServiceInterface testServiceInterface;

    public TestController(TestServiceInterface testServiceInterface) {
        this.testServiceInterface = testServiceInterface;
    }

    @GetMapping("/first")
    public User getStartPage(
            @RequestParam String name,
            @RequestParam String age
    ) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return user;
    }

    @PostMapping("/create")
    public List<User> createUser(
            @RequestBody User user
    ) {
        List<User> users = testServiceInterface.addNewUser(user);

        return users;
    }
}
