package com.example.simplechat.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthContoller {
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
