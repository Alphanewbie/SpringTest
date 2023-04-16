package com.example.springtest.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public class MainControllerHttpTest {

    @LocalServerPort
    private int port;

    private final String requestMapping = "/api/v1";

    @Autowired
    private TestRestTemplate restTemplateTest;

    @Test
    public void reqeust_hello() {
        String event_url = "http://localhost:" + port + requestMapping + "/hello";
        ResponseEntity<Map> responseEntity = restTemplateTest.getForEntity(event_url, Map.class);

        System.out.println(responseEntity);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

        Map<String, String> helloMap = responseEntity.getBody();

        assertThat(helloMap.get("test")).isEqualTo("test");
        assertThat(helloMap.get("message")).isEqualTo("hello");
    }
}
