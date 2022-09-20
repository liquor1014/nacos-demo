package com.example.nacosdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yhli
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.nacosdemo.mapper")
public class NacosdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosdemoApplication.class, args);
    }

}
