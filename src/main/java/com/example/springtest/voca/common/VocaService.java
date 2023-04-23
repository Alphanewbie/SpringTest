package com.example.springtest.voca.common;

import com.example.springtest.voca.common.dto.ResponseDTO;
import com.example.springtest.voca.common.dto.SentenceDTO;

public interface VocaService {
    SentenceDTO getRandomSentence();

    ResponseDTO addSentenceData(SentenceDTO sentenceDTO);

}
