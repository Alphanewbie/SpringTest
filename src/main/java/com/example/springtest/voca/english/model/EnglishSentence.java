package com.example.springtest.voca.english.model;

import com.example.springtest.common.dto.BaseTimeEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;

@Data
public class EnglishSentence extends BaseTimeEntity {
    @Id
    private Long id;
    private String sentence;
    private String meaning;

    @Builder
    public EnglishSentence(Long id, String sentence, String meaning) {
        this.id = id;
        this.sentence = sentence;
        this.meaning = meaning;
    }
}
