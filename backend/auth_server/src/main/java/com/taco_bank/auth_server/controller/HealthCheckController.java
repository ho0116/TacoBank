package com.taco_bank.auth_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/health")
public class HealthCheckController {

    @GetMapping
    public String healthCheck() {
        return "OK";
    }
}
