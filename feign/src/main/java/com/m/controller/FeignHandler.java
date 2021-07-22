package com.m.controller;

import com.m.entity.User;
import com.m.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/feign")

public class FeignHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }


    @GetMapping("/findAll")
    public Collection<User> findAll() {
        return feignProviderClient.findAll();
    }

}
