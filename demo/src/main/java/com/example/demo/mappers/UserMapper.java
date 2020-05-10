package com.example.demo.mappers;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    User Sel(int id);
    void gnn(int age);
}