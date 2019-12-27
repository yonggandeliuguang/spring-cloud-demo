package com.yang.controller;

import com.yang.model.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/feign/user")
public class RestFeignUserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/one/{id}")
    public User queryOne(@PathVariable("id") Integer id){
        return userService.queryOne(id);
    }


    @RequestMapping("/add")
    public Integer add(User user){
        return userService.add(user);
    }

}
