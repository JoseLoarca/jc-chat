package org.jcloarca.jcchat.chat.events;

import org.jcloarca.jcchat.entities.ChatMessage;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public class ChatEvent {
    ChatMessage message;

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
