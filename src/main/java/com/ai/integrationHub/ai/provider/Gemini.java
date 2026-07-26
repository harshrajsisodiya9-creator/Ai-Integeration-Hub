package com.ai.integrationHub.ai.provider;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
@RequiredArgsConstructor
public class Gemini implements Aiprovider{

    private final ChatModel chatModel;

    @Override
    public String generate(String prompt) {
        String ret = chatModel.call(prompt);
        System.out.println(ret);
        return ret;
    }
}
