package com.pancm.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author pancm
 * @Title: ConsumerController
 * @Description:
 * @Version:1.0.0
 * @date 2018年3月29日
 */
@RestController
public class ConsumerController {


    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println("接受到请求参数:" + name);
        return "你好，" + name;
    }

}
