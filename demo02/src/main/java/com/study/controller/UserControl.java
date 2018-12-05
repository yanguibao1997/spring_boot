package com.study.controller;

import com.study.dao.UserDao;
import com.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {

    @Autowired
    private UserDao userDao;

    @GetMapping("/demo02/{name}")
    public User selectUserByName(@PathVariable(name = "name") String name){
        User user = userDao.selectUserByName(name);
        return user;
    }
}
