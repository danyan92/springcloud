package com.pancm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author pancm
 * @Title: Application
 * @Description: springcloud服务入口
 * EnableEurekaServer 注解启动一个服务注册中心
 * @Version:1.0.0
 * @date 2018年3月29日
 */
@EnableEurekaServer
@SpringBootApplication
public class HystrixEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaApplication.class, args);
        System.out.println("hystrix注册中心服务启动...");
    }
}