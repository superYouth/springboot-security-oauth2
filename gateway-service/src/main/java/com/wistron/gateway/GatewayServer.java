package com.wistron.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayServer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(GatewayServer.class);

    public static void main(String[] args) {
        SpringApplication.run(GatewayServer.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Start application...");
    }
}
