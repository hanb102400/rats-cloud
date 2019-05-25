package com.rats.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringRegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRegisterCenterApplication.class, args);
    }
}
