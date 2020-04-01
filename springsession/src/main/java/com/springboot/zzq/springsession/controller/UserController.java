package com.springboot.zzq.springsession.controller;

import com.springboot.zzq.springsession.bean.User;
import com.springboot.zzq.springsession.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get1")
    public List<User> getAll(){
        List<User> users = userService.getAllOne();
        return users;
    }

    @GetMapping("/get2")
    public List<User> getAll2(){
        List<User> users2 = userService.getAllTwo();
        return users2;
    }

    @GetMapping("/get3")
    public String get(){
        return "ninhao";
    }

}
