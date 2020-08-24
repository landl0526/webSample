package com.example.demo.service.imps;

import com.example.demo.dao.AdminDao;
import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    AdminDao adminDao;

    @Override
    public boolean insertUser(UserDto user) {

        return userDao.insertUsers(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return adminDao.getAllUsers();
    }
}
