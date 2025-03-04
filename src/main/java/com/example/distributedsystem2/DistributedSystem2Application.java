package com.example.distributedsystem2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;


@EnableCaching
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DistributedSystem2Application {

    public static void main(String[] args) {
        SpringApplication.run(DistributedSystem2Application.class, args);
    }
}

