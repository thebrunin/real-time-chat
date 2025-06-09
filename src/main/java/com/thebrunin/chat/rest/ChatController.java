package com.thebrunin.chat.rest;

import com.thebrunin.chat.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat") // cliente envia pra /app/chat
    @SendTo("/topic/messages") // todos recebem em /topic/messages
    public ChatMessage send(ChatMessage message) {
        return message;
    }
}

