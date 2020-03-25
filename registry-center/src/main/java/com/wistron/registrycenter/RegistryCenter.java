package com.wistron.registrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryCenter {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenter.class, args);
    }

}
