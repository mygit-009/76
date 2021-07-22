package com.m.controller;

import com.m.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<User> findAll() {
        return restTemplate.getForObject("http://provider/user/findAll",Collection.class);
    }
    @GetMapping("/index")
    public String index(String port) {
        return restTemplate.getForObject("http://provider/user/index",String.class);
    }
}
