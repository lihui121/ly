package com.leyou.service;


import com.leyou.dao.UserDao;
import com.leyou.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User queryById(String id) {
        return this.userDao.getUserById(id);
    }
}
