package com.example.springtest.voca.english.dto.save;

import com.example.springtest.voca.english.dto.EnglishSentenceDTO;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReqeustSaveEnglishSentenceDTO extends EnglishSentenceDTO {


    @Builder
    public ReqeustSaveEnglishSentenceDTO(String sentence, String meaning) {
        super(sentence, meaning);
    }
}
