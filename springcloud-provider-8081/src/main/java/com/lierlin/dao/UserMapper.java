package com.lierlin.dao;

import com.lierlin.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public boolean add(User user);
    public User queryById(int id);
    public List<User> queryList();

}
