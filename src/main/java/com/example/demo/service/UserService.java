package com.example.demo.service;

import com.example.demo.dto.UserDto;

import java.util.List;

public interface UserService {

    boolean insertUser(UserDto user);

    List<UserDto> getAllUsers();
}
