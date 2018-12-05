package com.study.dao;

import com.study.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserDao {

    @Autowired
    private RestTemplate restTemplate;


    public User selectUserByName(String name){
        StringBuffer url=new StringBuffer();
        url.append("http://localhost:8080/hello/").append(name);
        User user = restTemplate.getForObject(url.toString(), User.class);
        return user;
    }

}
