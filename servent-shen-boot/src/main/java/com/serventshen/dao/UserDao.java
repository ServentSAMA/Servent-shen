package com.serventshen.dao;

import com.serventshen.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
