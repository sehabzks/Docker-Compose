package com.example.distributedsystem2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() throws Exception {
        String hostname = InetAddress.getLocalHost().getHostName();
        return "Hello from " + hostname;
    }
}