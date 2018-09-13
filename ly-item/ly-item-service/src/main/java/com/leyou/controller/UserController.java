package com.leyou.controller;


import com.leyou.entity.User;
import com.leyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    //这是一个注释
    //这是第二个注释
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") String id) {
        return this.userService.queryById(id);
    }


}
