package com.yang.controller;

import com.yang.model.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /***
     * 查询单条记录
     * @return
     */
    @RequestMapping(value = "/one/{id}")
    public User queryOne(@PathVariable(value = "id")Integer id){
        return userService.queryOne(id);
    }

    /***
     * 增加数据测试
     * @param user
     * @return
     */
    @RequestMapping(value = "/add")
    public Integer add(@RequestBody User user){
        return userService.add(user);
    }
}
