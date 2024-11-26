package com.example.github_actions_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        return "Hello World!!! 하이 안용제!!! CI/CD 적용됨!!!";
    }
}
