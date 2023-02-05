package com.lzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lzb
 * @date 2023/2/1 17:53
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka {
  public static void main(String[] args) {
      SpringApplication.run(Eureka.class);
  }
}
