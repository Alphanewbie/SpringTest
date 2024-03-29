package com.example.springtest.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("MainService")
public class MainServiceImpl implements MainService {

    public Map<String, String> getMakeHello() {
        Map<String, String> answer = new HashMap<>();
        answer.put("message", "hello");
        return answer;
    }
}
