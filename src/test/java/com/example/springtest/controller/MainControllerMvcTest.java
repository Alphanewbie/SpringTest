package com.example.springtest.controller;


import com.example.springtest.service.MainService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainController.class)
public class MainControllerMvcTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private MainService mainService;

    private final String requestMapping = "/api/v1";

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void reqeust_hello() throws Exception {
        Map<String, String> expectedResponse = new HashMap<>();
        expectedResponse.put("message", "hello");
        expectedResponse.put("test", "test");

        given(mainService.getMakeHello()).willReturn(expectedResponse);

        mvc.perform(MockMvcRequestBuilders.get(requestMapping + "/hello").contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk()).andExpect(content().json(mapper.writeValueAsString(expectedResponse)));
    }


}
