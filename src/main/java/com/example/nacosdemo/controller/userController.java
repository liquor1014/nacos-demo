package com.example.nacosdemo.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.nacosdemo.pojo.user;
import com.example.nacosdemo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user")
public class userController {

    @Autowired
    private userService service;


    @GetMapping("test")
    public List<user> test(String name) {
        return service.selList(name);
    }
}
