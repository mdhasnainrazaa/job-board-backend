package com.xcelerateit.controller;

import com.xcelerateit.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final List<User> registeredUsers = new ArrayList<>();

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        registeredUsers.add(user); // manually storing in memory 🧠
        return "User registered successfully: " + user.getName();
    }

    @GetMapping
    public List<User> getAllUsers() {
        return registeredUsers;
    }
}
