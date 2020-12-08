package com.lierlin.service.impl;

import com.lierlin.dao.UserMapper;
import com.lierlin.pojo.User;
import com.lierlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean add(User user) {
        return userMapper.add(user);
    }

    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }
}
