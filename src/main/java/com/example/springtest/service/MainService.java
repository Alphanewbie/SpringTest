package com.example.springtest.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MainService {

    public Map<String, String> getMakeHello() {
        Map<String, String> answer = new HashMap<>();
        answer.put("message", "hello");

        return answer;
    }
}
