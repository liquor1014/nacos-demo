package com.example.nacosdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yhli
 */
@EnableAutoConfiguration
@Configuration
public class NacosConfigConfiguration {

    @Bean(initMethod = "init")
    @ConditionalOnMissingBean
    @ConfigurationProperties(prefix = "spring.datasource.druid") //来获取application.yml配置的属性
    @RefreshScope
    public DruidDataSource dataSource() {
        return new DruidDataSource();
    }


}