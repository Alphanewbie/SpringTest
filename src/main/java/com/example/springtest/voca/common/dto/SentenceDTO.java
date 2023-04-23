package com.example.springtest.voca.common.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 이 클래스는 더 이상 상속 X, 이미 상속 2단계 구조
 */
@Data
@NoArgsConstructor
public class SentenceDTO {
    private String meaning;

    @Builder
    public SentenceDTO(String meaning) {
        this.meaning = meaning;
    }
}
