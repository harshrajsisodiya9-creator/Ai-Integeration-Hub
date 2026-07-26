package com.ai.integrationHub.ai.provider;


import org.springframework.ai.chat.model.ChatResponse;

public interface Aiprovider {
        String generate(String prompt);
}
