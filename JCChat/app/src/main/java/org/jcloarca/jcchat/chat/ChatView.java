package org.jcloarca.jcchat.chat;

import org.jcloarca.jcchat.entities.ChatMessage;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public interface ChatView {
    void onMessageReceived(ChatMessage msg);
}
