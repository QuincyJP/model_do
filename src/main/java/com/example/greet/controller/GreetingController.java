package com.example.greet.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, Welcome to Spring Boot!";
    }
}