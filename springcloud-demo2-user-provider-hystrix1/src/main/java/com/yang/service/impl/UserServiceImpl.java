package com.yang.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yang.model.User;
import com.yang.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {


    /**
     * 没有找到数据时，进入此方法
     * @return
     */
    private User noDataHandler(Integer id){
        User user = new User();
        user.setId(id);
        user.setUsername("熔断调用");
        return user;
    }

    @HystrixCommand(fallbackMethod = "noDataHandler")
    @Override
    public User queryOne(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("正常调用");
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0){
            throw new RuntimeException();
        }
        return user;
    }

    @Override
    public Integer add(User user) {
        return null;
    }
}
