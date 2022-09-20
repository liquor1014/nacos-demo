package com.example.nacosdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.nacosdemo.pojo.user;

import java.util.List;

public interface userService extends IService<user> {
    List<user> selList(String name);
}
