package com.prodonik.websocket.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ChatMessage {
    String content;
    String sender;
    MessageType type;
}
