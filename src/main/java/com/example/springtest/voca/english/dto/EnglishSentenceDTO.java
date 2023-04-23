package com.example.springtest.voca.english.dto;

import com.example.springtest.voca.common.dto.SentenceDTO;
import com.example.springtest.voca.english.model.EnglishSentence;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class EnglishSentenceDTO extends SentenceDTO {
    private String sentence;

    public EnglishSentenceDTO(String sentence, String meaning) {
        super(meaning);
        this.sentence = sentence;
    }

    public EnglishSentence getEntity() {
        return EnglishSentence.builder()
                .sentence(this.getSentence())
                .meaning(this.getMeaning())
                .build();
    }
}
