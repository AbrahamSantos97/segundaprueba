package com.example.secondtestgoogle.secondtestgoogle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET, value = {"/home"})
public class HomeController {
    
    @GetMapping("/init")
    public String hello(){
        return "Hello boy";
    }
}
