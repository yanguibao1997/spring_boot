package com.study.service;

import com.study.mapper.UserMapper;
import com.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUserById(String name){
        User use=new User();
        use.setName(name);
        User user = userMapper.select(use).get(0);
        return user;
    }
}
