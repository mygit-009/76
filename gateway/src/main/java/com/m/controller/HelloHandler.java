package com.m.controller;


import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/hello")
class HelloHandler {
    @GetMapping("/index")
    public String index() {
        return "hello world !";
    }

}
