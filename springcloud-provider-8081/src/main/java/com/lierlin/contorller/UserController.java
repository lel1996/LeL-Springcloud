package com.lierlin.contorller;

import com.lierlin.pojo.User;
import com.lierlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public boolean add(User user){
        return userService.add(user);
    }
    @RequestMapping("selectById/{id}")
    public User selectById(@PathVariable("id") int id){
        return userService.queryById(id);
    }
    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return userService.queryList();
    }
}
