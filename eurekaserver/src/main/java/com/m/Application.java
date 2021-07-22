package com.m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer               //标注为可用的注册中心
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}