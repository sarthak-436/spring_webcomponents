package com.example.seyHello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello() {
        return "Hello from the Service Layer!";
    }
}
