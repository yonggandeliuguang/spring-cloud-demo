package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringcloudDemo4ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemo4ZuulApplication.class, args);
    }

}
