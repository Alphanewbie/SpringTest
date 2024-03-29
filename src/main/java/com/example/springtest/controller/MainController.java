package com.example.springtest.controller;


import com.example.springtest.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MainController {
    @Autowired
    @Qualifier("MainService")
    private MainService mainService;

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> answer = mainService.getMakeHello();
        answer.put("test", "test");
        return answer;
    }
}
