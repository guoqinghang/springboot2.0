package com.guo.controller;

import com.guo.domain.JsonData;
import com.guo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public void add(){
        userService.addUser("李三",11);
    }

    @GetMapping("/getUser")
    public Object addAccount() {
        int id = userService.getAllUsers();
        return JsonData.buildSuccess(id);
    }
}
