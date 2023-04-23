package com.example.springtest.voca.english.service;

import com.example.springtest.voca.common.VocaService;
import com.example.springtest.voca.common.dto.ResponseDTO;
import com.example.springtest.voca.common.dto.SentenceDTO;
import com.example.springtest.voca.english.dto.EnglishSentenceDTO;
import com.example.springtest.voca.english.dto.save.ReqeustSaveEnglishSentenceDTO;
import com.example.springtest.voca.english.repository.EnglishSentenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("EnglishService")
public class EnglishServiceImpl implements VocaService {

    @Autowired
    private EnglishSentenceRepository englishSentenceRepository;
    @Override
    public SentenceDTO getRandomSentence() {
        SentenceDTO answer = new EnglishSentenceDTO();
        return answer;
    }

    @Override
    public ResponseDTO addSentenceData(EnglishSentenceDTO sentenceDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        // TODO 결과값 확인 필요.
        englishSentenceRepository.save(sentenceDTO.getEntity());
        return responseDTO;
    }
}
