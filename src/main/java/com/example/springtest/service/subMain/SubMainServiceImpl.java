package com.example.springtest.service.subMain;

import com.example.springtest.service.MainService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Qualifier("SubMainService")
public class SubMainServiceImpl implements MainService {
    @Override
    public Map<String, String> getMakeHello() {
        Map<String, String> answer = new HashMap<>();
        answer.put("message", "good morning");
        return answer;
    }
}
