package com.ai.integrationHub.chats.DTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ChatRequest {
    @NotBlank(message = "empty prompts not allowed")
    String prompt;
}
