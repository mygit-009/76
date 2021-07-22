package com.m.repository.impl;

import com.m.entity.User;
import com.m.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private Map<Integer,User> userMap;

    public UserRepositoryImpl() {
        userMap = new HashMap<>();
        userMap.put(1, new User(12, "HELLO1"));
        userMap.put(2, new User(13, "HELLO2"));
        userMap.put(3, new User(14, "HELLO3"));
    }

    @Override
    public Collection<User> findAll() {
        return userMap.values();
    }

    @Override
    public User findById(Integer id) {
        return userMap.get(id);
    }

    @Override
    public void saveOrUpdate(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public void deleteById(Integer id) {
        userMap.remove(id);
    }
}
