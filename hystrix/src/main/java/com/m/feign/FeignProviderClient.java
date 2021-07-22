package com.m.feign;

import com.m.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/user/findAll")
    public Collection<User> findAll();
    @GetMapping("/user/index")
    public String index();
}
