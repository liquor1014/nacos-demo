package com.example.nacosdemo.service.Impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.nacosdemo.service.userService;
import com.example.nacosdemo.pojo.user;
import com.example.nacosdemo.mapper.userMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yhli
 */
@Service
public class userServiceImpl extends ServiceImpl<userMapper, user> implements userService {


    @Override
    public List<user> selList(String name) {
        return super.baseMapper.selectList(new LambdaQueryWrapper<user>()
                .eq(user::getName, name));
    }
}
