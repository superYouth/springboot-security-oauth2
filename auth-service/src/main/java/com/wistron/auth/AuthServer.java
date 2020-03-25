package com.wistron.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthServer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AuthServer.class);

    public static void main(String[] args) {
        SpringApplication.run(AuthServer.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Start application...");
    }
}
