package com.example.seyHello.controller;

import org.springframework.web.bind.annotation.*;
import com.example.seyHello.service.HelloService;

@RestController
public class HelloController {

    private HelloService helloserviceobject;

    public HelloController(HelloService helloserviceobject){
        this.helloserviceobject = helloserviceobject;
    }
    
    @GetMapping("/hello")
    public String hello(){
        return helloserviceobject.sayHello();
    }
}
