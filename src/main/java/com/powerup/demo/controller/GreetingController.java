package com.powerup.demo.controller;

import com.powerup.demo.service.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @GetMapping("/blue")
    public Greeting blue() {
        return new Greeting(String.format(template, "Blue"));
    }

    @GetMapping("/green")
    public Greeting green() {
        return new Greeting(String.format(template, "Green"));
    }
}