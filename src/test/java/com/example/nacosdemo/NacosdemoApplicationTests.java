package com.example.nacosdemo;

import com.example.nacosdemo.service.userService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NacosdemoApplicationTests {

    @Autowired
    private userService service;
    @Test
    void contextLoads() {

        String name = "li";

        service.selList(name);
    }

}
