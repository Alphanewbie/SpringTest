package com.example.springtest.voca.english.repository;

import com.example.springtest.voca.english.model.EnglishSentence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnglishSentenceRepository extends JpaRepository<EnglishSentence, Long> {

}