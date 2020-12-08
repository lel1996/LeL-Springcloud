package com.lierlin.service;

import com.lierlin.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "springcloud-provider-8001")
@Component
public interface UserClientService {
    @RequestMapping("/add")
    public boolean add(User user);
    @RequestMapping("/selectById/{id}")
    public User selectById(@PathVariable("id") int id);
    @RequestMapping("/selectAll")
    public List<User> selectAll();
}
