package com.robin.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //
public class ConfigBean {

    @Bean
    @LoadBalanced // 实现负载均衡，调用地址IP可以变成服务名称，服务名称就是调用的那个yml配置中的服务名称spring.application.name
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
