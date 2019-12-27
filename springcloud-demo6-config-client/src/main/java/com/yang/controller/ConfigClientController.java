package com.yang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Autowired
    private Environment env;

    /**
     * 获取配置信息
     * @return
     */
    @RequestMapping("/version")
    public String version(){
        return env.getProperty("spring.application.name")+","+env.getProperty("server.port");
    }
}
