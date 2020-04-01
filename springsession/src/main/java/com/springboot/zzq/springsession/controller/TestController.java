package com.springboot.zzq.springsession.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @Value("${server.port}")
    Integer port;


    @GetMapping("/set")
    public String set(HttpSession session){
        session.setAttribute("user", "javaboy");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get (HttpSession session){
        return session.getAttribute("user")+":"+port;
    }
}
