package com.tian.mybatispluslearning.controller;

import com.tian.mybatispluslearning.entity.User;
import com.tian.mybatispluslearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Package: com.tian.mybatispluslearning.controller
 * Description： TODO
 * Author: 田智龙
 * Date: Created in 2021/7/7 8:42
 * Company: 山东理工大学
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("select/{id}")
    public User select(@PathVariable("id") int id){
         return userService.select(id);
    }

    @RequestMapping("add")
    public List<User> add(User user){
        userService.add(user);
        return userService.list();
    }


    @RequestMapping("delete/{id}")
    public List<User> delete(int id){
        userService.delete(id);
        return userService.list();
    }

    @RequestMapping("update")
    public List<User> update(User user){
        userService.update(user);
        return userService.list();
    }

    @RequestMapping("list")
    public List<User> list(){
        return userService.list();
    }
}
