package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public List<UserDto> login() {
        return userService.getAllUsers();
    }
}
