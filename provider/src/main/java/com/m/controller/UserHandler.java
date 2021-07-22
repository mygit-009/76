package com.m.controller;

import com.m.entity.User;
import com.m.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/user")

public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index() {
        System.out.println("端口是："+this.port);
        return "端口是："+this.port;
    }


    @GetMapping("/findAll")
    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userRepository.saveOrUpdate(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user) {
        userRepository.saveOrUpdate(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id) {
        userRepository.deleteById(id);

    }
}
