package com.example.springtest.web;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mvc;

    private String requestMapping = "/api/v1";

    private ObjectMapper mapper = new ObjectMapper();

//    @Test
//    public void return_hello() throws Exception {
//        Map<String, String> testAnswer = new HashMap<>();
//
//        testAnswer.put("message", "hello");
//
//        String testString = mapper.writeValueAsString(testAnswer);
//
//        mvc.perform(MockMvcRequestBuilders.get(requestMapping + "/hello"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().json(testString));
//
//    }

    @Test
    public void return_hello2() throws Exception {
        Map<String, String> testAnswer = new HashMap<>();

        testAnswer.put("message", "hello");

        String testString = mapper.writeValueAsString(testAnswer);

        final ResultActions actions = mvc.perform(MockMvcRequestBuilders.get(requestMapping + "/hello").contentType(MediaType.APPLICATION_JSON)).andDo(print());

        actions.andExpect(status().isOk())
                .andExpect(jsonPath("message").exists())
                .andExpect(jsonPath("message").isString())
                .andExpect(jsonPath("message").value("hello"));

    }


}
