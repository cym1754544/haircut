package com.example.demo.service;

import com.example.demo.mappers.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;


    public User Sel(int id)
    {
        return userMapper.Sel(id);
    }

    public void gnn(int age){
        userMapper.gnn(age);
    }
}
