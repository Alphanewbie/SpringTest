package com.example.springtest.controller.subMain;

import com.example.springtest.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/sub")
public class SubMainController {

    @Qualifier("SubMainService")
    final private MainService subMainService;

    public SubMainController(@Qualifier("SubMainService") MainService subMainService) {
        this.subMainService = subMainService;
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> answer = subMainService.getMakeHello();
        answer.put("test", "test");
        return answer;
    }
}
