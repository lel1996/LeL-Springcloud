package com.lierlin.contorller;

import com.lierlin.pojo.User;
import com.lierlin.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("selectById/{id}")
    @HystrixCommand(fallbackMethod = "HystrixGet")
    public User selectById(@PathVariable("id") int id) {
        User user = userService.queryById(id);
        if (user == null) {
            throw new RuntimeException("fail");
        }
        return user;
    }

    public User HystrixGet(@PathVariable("id") int id) {
        return new User().setId(id).setName("id=>" + id + "没有对应的信息，null-@Hystrix").setPasswd("no this resource in this db");
    }

}
