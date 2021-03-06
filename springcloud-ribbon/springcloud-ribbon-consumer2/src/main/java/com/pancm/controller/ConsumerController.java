package com.pancm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pancm
 * @Title: ConsumerController
 * @Description: 用于做转发请求
 * @Version:1.0.0
 * @date 2018年3月29日
 */
@RestController
public class ConsumerController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name + ",Hello World!";
    }

}
