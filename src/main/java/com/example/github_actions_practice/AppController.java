package com.example.github_actions_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        return "Hello World!!! 하이 안용제!!! CI/CD 적용됨!!! SSH 연동이 되지 않아 고생하고 있음!!! SSH 연동은 된 듯. memory 오류 발생!!! Swap을 늘리고 다시 시도";
    }
}
