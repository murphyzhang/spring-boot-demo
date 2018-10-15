package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${resources.env}")
    private String env;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world! Spring boot! 当前环境: " + env;
    }
}
