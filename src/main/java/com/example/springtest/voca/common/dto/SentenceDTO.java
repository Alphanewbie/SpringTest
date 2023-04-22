package com.example.springtest.voca.common.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SentenceDTO {
    private String meaning;

    @Builder
    public SentenceDTO(String meaning) {
        this.meaning = meaning;
    }
}
