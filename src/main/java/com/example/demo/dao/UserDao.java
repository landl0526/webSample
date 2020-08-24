package com.example.demo.dao;

import com.example.demo.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    boolean insertUsers(UserDto user);
}
