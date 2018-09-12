package com.leyou.dao;


import com.leyou.entity.User;
import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;
@Component
public interface UserDao {
    public User getUserById(String id);
}
