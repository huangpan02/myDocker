package com.example.mydocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小墨
 * @version 1.0
 * @description 测试 controller
 * @date 2021/9/10 16:57
 **/
@RestController
@RequestMapping("/MyTest")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world!欢迎来到docker的世界！";
    }

}
