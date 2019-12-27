package com.yang.service;

import com.yang.model.User;
import com.yang.utils.UserServiceFallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "eureka-provider",fallbackFactory = UserServiceFallBackFactory.class)
public interface UserService {

    @RequestMapping("/user/add")
    int add(User user);

    @RequestMapping("/user/one/{id}")
    User queryOne(@PathVariable("id") Integer id);
}
