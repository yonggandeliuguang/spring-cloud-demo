package com.yang.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringConfig {

    /***
     * 创建一个RestTemplate并交给SpringIOC容器管理
     * @return
     */
    @Bean(name = "restTemplate")
    @LoadBalanced
    public RestTemplate createRestTemplate(){
        return  new RestTemplate();
    }


    /**
     * 随机
     * @return
     */
//    @Bean(name = "randomRule")
//    public RandomRule createRandomRule(){
//        return new RandomRule();
//    }


    /**
     * 重试
     * @return
     */
//    @Bean(name = "retryRule")
//    public RetryRule createRetryRule(){
//        return new RetryRule();
//    }

    /**
     * 加权法，时间响应越快权重越大
     */
//    @Bean
//    public IRule createWeightResponseTimeRule(){
//        return new WeightedResponseTimeRule();
//    }

//
//    /**
//     *自定义负载均衡
//     * @return
//     */
//    @Bean
//    public CustomLoadBalanceRule createCustomLoadBalanceRule(){
//        return new CustomLoadBalanceRule();
//    }

}
