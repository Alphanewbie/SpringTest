package com.example.springtest.controller;

import com.example.springtest.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return mainService.getMakeHello();
    }
}
