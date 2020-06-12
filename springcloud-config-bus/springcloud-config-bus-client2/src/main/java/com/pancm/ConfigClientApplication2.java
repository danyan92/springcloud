package com.pancm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pancm
 * @Title: Application
 * @Description: 程序入口
 * EnableDiscoveryClient 表示该项目就具有了服务注册的功能
 * @Version:1.0.0
 * @date 2018年3月29日
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication2.class, args);
        System.out.println("配置中心第二个客户端启动成功!");
    }
}
