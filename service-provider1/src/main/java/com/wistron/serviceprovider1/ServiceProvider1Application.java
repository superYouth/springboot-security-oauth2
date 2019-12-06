package com.wistron.serviceprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider1Application.class, args);
    }

}
