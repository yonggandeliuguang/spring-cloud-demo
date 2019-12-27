package com.yang.controller;

import com.yang.model.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    /**
     * 查询单挑记录
     * @return
     */
    @RequestMapping("/one/{id}")
    public User queryOne(@PathVariable("id") Integer id){
        return userService.queryOne(id);
    }

}
