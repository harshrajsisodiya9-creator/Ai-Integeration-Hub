package com.ai.integrationHub.chats.Services;

import com.ai.integrationHub.ai.provider.Aiprovider;
import com.ai.integrationHub.chats.DTOs.ChatRequest;
import com.ai.integrationHub.chats.DTOs.ChatResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChatService {

    private final Aiprovider provider;

    public ChatResponse createResponse(ChatRequest request){
        String response = provider.generate(request.getPrompt());
        return new ChatResponse(response);
    }
}
