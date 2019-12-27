package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class SpringcloudDemo3HystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemo3HystrixdashboardApplication.class, args);
    }

}
