package com.ehizman.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "Home Controller")
public class HomeController {
    @RequestMapping("/")
    public String welcome(){
        return "Welcome to my Spring Security Demo";
    }
    @RequestMapping("/users")
    public String welcomeUsers(){
        return "Hello User. Welcome to my Spring Security Demo";
    }
    @RequestMapping("/admin")
    public String welcomeAdmin(){
        return "Hello Admin. Welcome to my Spring Security Demo";
    }
}
