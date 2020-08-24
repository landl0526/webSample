package com.example.demo.dao;

import com.example.demo.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminDao {

    List<UserDto> getAllUsers();
}
