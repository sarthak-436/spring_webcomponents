package com.example.seyHello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello, First Project";
    }
}
