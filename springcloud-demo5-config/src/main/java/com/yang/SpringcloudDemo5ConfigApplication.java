package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringcloudDemo5ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemo5ConfigApplication.class, args);
    }

}
