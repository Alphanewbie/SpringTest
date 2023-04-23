package com.example.springtest.voca.korean.service;

import com.example.springtest.voca.common.VocaService;
import com.example.springtest.voca.common.dto.ResponseDTO;
import com.example.springtest.voca.common.dto.SentenceDTO;
import com.example.springtest.voca.english.dto.save.ReqeustSaveEnglishSentenceDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("KoreanService")
public class KoreanServiceImpl implements VocaService {
    @Override
    public SentenceDTO getRandomSentence() {
        return null;
    }

    @Override
    public ResponseDTO addSentenceData(SentenceDTO sentenceDTO) {
        return null;
    }

    @Override
    public ResponseDTO addSentenceData(ReqeustSaveEnglishSentenceDTO reqeustDTO) {
        return null;
    }
}
