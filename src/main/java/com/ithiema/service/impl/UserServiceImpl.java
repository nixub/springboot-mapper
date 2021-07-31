package com.ithiema.service.impl;

import com.ithiema.dao.UserDao;
import com.ithiema.pojo.User;
import com.ithiema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
