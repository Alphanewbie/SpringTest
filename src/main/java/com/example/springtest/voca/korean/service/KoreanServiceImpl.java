package com.example.springtest.voca.korean.service;

import com.example.springtest.voca.common.VocaService;
import com.example.springtest.voca.common.dto.SentenceDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("KoreanService")
public class KoreanServiceImpl implements VocaService {
    @Override
    public SentenceDTO getRandomSentence() {
        return null;
    }
}
