package com.example.springtest.voca.english.dto;

import com.example.springtest.voca.common.dto.SentenceDTO;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnglishSentenceDTO extends SentenceDTO {
    private String sentence;


    @Builder
    public EnglishSentenceDTO(String sentence, String meaning) {
        super(meaning);
        this.sentence = sentence;
    }
}
