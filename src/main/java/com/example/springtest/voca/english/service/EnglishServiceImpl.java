package com.example.springtest.voca.english.service;

import com.example.springtest.voca.common.VocaService;
import com.example.springtest.voca.common.dto.SentenceDTO;
import com.example.springtest.voca.english.dto.EnglishSentenceDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("EnglishService")
public class EnglishServiceImpl implements VocaService {
    @Override
    public SentenceDTO getRandomSentence() {
        SentenceDTO answer = new EnglishSentenceDTO();
        return answer;
    }
}
