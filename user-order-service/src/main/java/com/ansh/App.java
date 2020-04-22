package com.ansh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("User order service is starting");
        SpringApplication.run(App.class, args);
    }
}
