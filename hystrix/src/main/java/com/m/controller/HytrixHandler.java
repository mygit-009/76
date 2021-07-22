package com.m.controller;

import com.m.feign.FeignProviderClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hystrix")
public class HytrixHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }




}
