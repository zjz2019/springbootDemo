package com.spring.web.service.impl;

import com.spring.web.dao.UserDao;
import com.spring.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int updateInfo(String sql) {
        return userDao.updateInfo(sql);
    }

    @Override
    public int insertSql(String sql) {
        return userDao.insertSql(sql);
    }

    @Override
    public List<Object> querySql(String sql) {
        return userDao.querySql(sql);
    }

    @Override
    public int deleteSql(String sql) {
        return userDao.deleteSql(sql);
    }
}
