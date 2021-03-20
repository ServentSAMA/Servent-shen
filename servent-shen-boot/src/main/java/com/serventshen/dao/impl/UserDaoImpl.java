package com.serventshen.dao.impl;

import com.serventshen.dao.UserDao;
import com.serventshen.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;



@Mapper
@Repository
public class UserDaoImpl implements UserDao {



    @Override
    public List<User> findAll() {
        return null;
    }
}
