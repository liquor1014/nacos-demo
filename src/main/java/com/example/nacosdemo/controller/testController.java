package com.example.nacosdemo.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("nacos")
@RefreshScope
public class testController {


    @Value(value = "${spring.datasource.druid.url}")
    private String useLocalCache;

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        System.out.println("url: " + useLocalCache);
        return useLocalCache;
    }


}
