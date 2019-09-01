package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    @Autowired
    private UserMapper b1;
    @RequestMapping("/getUser")
    @Transactional
    public User getUser() {
        User  user=a.getById("1");
        return user;
    }


    @RequestMapping("/getUsers")
    @Transactional
    public List<User> getUsers() {
        List<User>  users=a.list();
        return users;
    }


    @RequestMapping("/addUser")
    @Transactional
    public boolean addUser() {
        User tmp=new User();
        tmp.setName("12");
        tmp.setAge(12);
        boolean  u=a.save(tmp );
        return u;
    }

    @RequestMapping("/delUser")
    @Transactional
    public boolean delUser() {
        User tmp=new User();
        tmp.setName("12");
        tmp.setAge(12);
        boolean  u=a.removeById(1 );
        return u;
    }

    @RequestMapping("/update")
    public boolean update() {
        User tmp=new User();
        tmp.setId(1);
        tmp.setName("55");
        tmp.setAge(67);
        System.out.println(tmp.getId());
        boolean  u=a.save(tmp );  //为什么不写id?????qiguai .
        return u;
    }














}
