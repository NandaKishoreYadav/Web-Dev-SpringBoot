package com.nandakishore.web_dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String hello(){
        return "This is Home Page of the Website";
    }
}
