package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@RibbonClient(name = "CustomLoadBalanceRule",configuration = CustomLoadBalanceRule.class)
@SpringBootApplication
@EnableFeignClients(basePackages = "com.yang.service")
public class SpringcloudDemo1UserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemo1UserConsumerApplication.class, args);
    }

}
