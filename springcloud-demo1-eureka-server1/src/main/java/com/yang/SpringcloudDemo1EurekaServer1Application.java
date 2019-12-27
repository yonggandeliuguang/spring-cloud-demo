package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudDemo1EurekaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemo1EurekaServer1Application.class, args);
    }

}
