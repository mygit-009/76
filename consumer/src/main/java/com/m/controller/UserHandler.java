package com.m.controller;

import com.m.entity.User;
import com.m.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")

public class UserHandler {
    @Autowired
//    private UserRepository userRepository;
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<User> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/user/findAll",Collection.class).getBody();
    }

//    @GetMapping("/findById/{id}")
//    public User findById(@PathVariable("id") Integer id) {
//        return userRepository.findById(id);
//    }
//
//    @PostMapping("/save")
//    public void save(@RequestBody User user) {
//        userRepository.saveOrUpdate(user);
//    }
//
//    @PutMapping("/update")
//    public void update(@RequestBody User user) {
//        userRepository.saveOrUpdate(user);
//    }
//
//    @DeleteMapping("/deleteById/{id}")
//    public void deleteById(@PathVariable Integer id) {
//        userRepository.deleteById(id);
//
//    }
}
