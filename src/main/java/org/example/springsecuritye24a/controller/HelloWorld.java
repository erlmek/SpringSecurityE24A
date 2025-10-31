package org.example.springsecuritye24a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello World";
    }





}
