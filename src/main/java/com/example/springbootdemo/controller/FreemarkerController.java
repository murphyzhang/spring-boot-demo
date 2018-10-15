package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "小沫子!");
        model.addAttribute("hello", "早上好!");

        return "index";
    }
}