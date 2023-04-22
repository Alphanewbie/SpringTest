package com.example.springtest.voca.korean.controller;


import com.example.springtest.voca.common.VocaService;
import com.example.springtest.voca.common.dto.SentenceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/korean")
public class KoreanController {
    @Autowired
    @Qualifier("KoreanService")
    private VocaService vocaService;

    @GetMapping("/sentences/random")
    public SentenceDTO getSentence() {
        return vocaService.getRandomSentence();
    }
}
