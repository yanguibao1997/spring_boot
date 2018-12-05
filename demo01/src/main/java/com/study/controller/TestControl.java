package com.study.controller;

import com.study.pojo.User;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControl {

    @Autowired
    private UserService userService;

    @GetMapping("/hello/{name}")
    @ResponseBody
    public User test(@PathVariable(value = "name") String name){
        User user = userService.selectUserById(name);
        return user;
    }
}
