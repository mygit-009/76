package com.m.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
class HelloHandler {
    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index() {
        System.out.println("端口是："+this.port);
        return "端口是："+this.port;
    }

}
