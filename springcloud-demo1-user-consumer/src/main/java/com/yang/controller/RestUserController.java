package com.yang.controller;

import com.yang.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/rest/user")
public class RestUserController {

    @Autowired
    public RestTemplate restTemplate;

    /***
     * 远程调用实现
     * @param id
     * @return
     */
    @RequestMapping(value = "/one/{id}")
    public User queryOne(@PathVariable("id")Integer id){
        return restTemplate.getForObject("http://eureka-provider/user/one/"+id,User.class);
    }

    @RequestMapping("/one/post/{id}")
    public User queryOneByPost(@PathVariable("id")Integer id){
        return restTemplate.postForObject("http://localhost:18081/user/one/"+id,id,User.class);
    }

    /***
     * 远程调用增加数据
     * @param user
     * @return
     */
    @RequestMapping(value = "/add")
    public Integer add(User user){
        return restTemplate.postForObject("http://eureka-provider/user/add",user,Integer.class);
    }
}
