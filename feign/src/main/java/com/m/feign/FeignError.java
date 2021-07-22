package com.m.feign;

import com.m.entity.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProviderClient{
    @Override
    public Collection<User> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护。。。。。";
    }
}
