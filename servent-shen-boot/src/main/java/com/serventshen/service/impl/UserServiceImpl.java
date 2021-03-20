package com.serventshen.service.impl;

import com.serventshen.dao.UserDao;
import com.serventshen.pojo.User;
import com.serventshen.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public List<User> findAll() {
        List<User> userList = userDao.findAll();
        return userList;
    }
}
