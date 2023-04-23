package com.example.springtest.voca.english.controller;


import com.example.springtest.service.MainService;
import com.example.springtest.voca.common.VocaService;
import com.example.springtest.voca.common.dto.ResponseDTO;
import com.example.springtest.voca.common.dto.SentenceDTO;
import com.example.springtest.voca.english.dto.save.ReqeustSaveEnglishSentenceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/english")
public class EnglishController {

    @Autowired
    @Qualifier("EnglishService")
    private VocaService vocaService;

    @GetMapping("/sentences/random")
    public SentenceDTO getSentence() {
        return vocaService.getRandomSentence();
    }

    @PostMapping("/sentences")
    public ResponseDTO AddSentence(ReqeustSaveEnglishSentenceDTO requestDto) {
        return vocaService.addSentenceData(requestDto);
    }

}
