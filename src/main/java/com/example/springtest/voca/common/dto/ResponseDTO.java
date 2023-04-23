package com.example.springtest.voca.common.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ResponseDTO {
    private int successCount = 0;
    private int failCount = 0;
    private int totalCount = 0;
    private List<String> userMessage = new ArrayList<>();


    public void addSuccessCount() {
        this.successCount += 1;
        this.totalCount += 1;
    }

    public void addSuccessCount(String message) {
        this.successCount += 1;
        this.totalCount += 1;
        userMessage.add(message);
    }

    public void addFailCount() {
        this.failCount += 1;
        this.totalCount += 1;
    }

    public void addFailCount(String message) {
        this.failCount += 1;
        this.totalCount += 1;
        userMessage.add(message);
    }
}
