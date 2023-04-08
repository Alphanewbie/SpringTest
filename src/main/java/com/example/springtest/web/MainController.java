package com.example.springtest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> answer = new HashMap<>();
        answer.put("message", "hello");
        return answer;
    }
}
