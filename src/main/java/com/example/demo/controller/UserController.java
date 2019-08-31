package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>1
 *
 * @author zhagnbo284
 * @since 2019-08-31
 */
@RestController

public class UserController {
    @Autowired
    private IUserService a;
    @RequestMapping("/getUser")
    public User getUser() {
        User  user=a.getById("1");
        return user;
    }


    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User>  users=a.list();
        return users;
    }





}
