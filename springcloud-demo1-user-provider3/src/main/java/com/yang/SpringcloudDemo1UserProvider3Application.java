package com.yang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.yang.mapper") // mapper接口的路径
@SpringBootApplication
public class SpringcloudDemo1UserProvider3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemo1UserProvider3Application.class, args);
    }

}
