package com.guo.springboot_dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @GetMapping("/test")
    public Object test(){
        String msg = "测试热部署";
        System.out.println("热加载1111");
        return msg;
    }


}
