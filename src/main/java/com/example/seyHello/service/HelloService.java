package com.example.seyHello.service;

import org.springframework.stereotype.Service;
import com.example.seyHello.model.HelloResponse;

@Service
public class HelloService {

    public HelloResponse sayHello(String name) {
        HelloResponse obj = new HelloResponse("This is the message for " + name);
        return obj;
    }
}
