package com.lzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lzb
 * @date 2023/1/31 21:26
 */
@SpringBootApplication
public class SpringCloud_01 {
  public static void main(String[] args) {
      SpringApplication.run(SpringCloud_01.class); }
    /**
     * 创建RestTemplate并注入spring容器
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

