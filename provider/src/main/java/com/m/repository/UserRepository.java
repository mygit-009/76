package com.m.repository;

import com.m.entity.User;

import java.util.Collection;

public interface UserRepository {
    public Collection<User> findAll();
    public User findById(Integer id);
    public void saveOrUpdate(User user);
    public  void deleteById(Integer id);
}
