package com.ai.integrationHub.chats.Contollers;

import com.ai.integrationHub.chats.DTOs.ChatRequest;
import com.ai.integrationHub.chats.DTOs.ChatResponse;
import com.ai.integrationHub.chats.Services.ChatService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/chats")
public class ChatController {

    private final ChatService chatService;

    @PostMapping()
    public ChatResponse createChat(@Valid @RequestBody ChatRequest request){
        return chatService.createResponse(request);
    }
}
