package com.example.demo002.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //负责接收
    @RequestMapping("/hello")
    //返回内容到浏览器
    @ResponseBody
    public String hello(){
        return "hello spring boot";
    }
}
