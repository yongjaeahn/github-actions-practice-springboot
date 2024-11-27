package com.example.github_actions_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        return "Hello World!!! 하이 안용제!!! CI/CD 적용됨!!! SSH 연동이 되지 않아 고생하고 있음!!! SSH 연동은 된 듯!!! gradlew 실행권한 없음!!! 이번에는 문법 오류 으~~~ 이번에 Hang!!! Swap Memory 증설 중(t2.micro환경 swap메모리 할당으로 Linux 가상 메모리 늘려주기)!!! application.properties -> application.yml";
    }
}
