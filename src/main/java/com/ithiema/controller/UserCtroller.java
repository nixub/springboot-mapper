package com.ithiema.controller;

import com.ithiema.pojo.User;
import com.ithiema.service.UserService;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
@RestController
@RequestMapping("/user")
public class UserCtroller {

    @Autowired
    private UserService userService;
    @RequestMapping("/{id}")
    public User findById(@PathVariable(name = "id") Integer id){
        return userService.findById(id);
    }
}
