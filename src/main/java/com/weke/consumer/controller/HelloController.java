package com.weke.consumer.controller;

import com.weke.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @RequestMapping("hello")
    public String hellos() {
        return userService.hello();
    }
}
