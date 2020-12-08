package com.lierlin.service;

import com.lierlin.pojo.User;

import java.util.List;

public interface UserService {

    public boolean add(User user);
    public User queryById(int id);
    public List<User> queryList();
}
