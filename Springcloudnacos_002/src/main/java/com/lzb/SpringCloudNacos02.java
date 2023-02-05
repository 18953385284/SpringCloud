package com.lzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author lzb
 * @date 2023/2/2 10:47
 */
@SpringBootApplication
@EnableFeignClients //openfeign远程调用需要的注解
public class SpringCloudNacos02 {
  public static void main(String[] args) {
      SpringApplication.run(SpringCloudNacos02.class);
  }
    /**
     * 创建RestTemplate并注入spring容器
     */
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
