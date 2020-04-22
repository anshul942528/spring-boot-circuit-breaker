package com.ansh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@Slf4j
@EnableCircuitBreaker
@EnableHystrixDashboard
public class App {

    public static void main(String[] args) {
        log.info("Order service is starting");
        SpringApplication.run(App.class, args);
    }
}
