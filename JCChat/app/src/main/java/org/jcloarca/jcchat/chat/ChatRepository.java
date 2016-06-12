package org.jcloarca.jcchat.chat;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public interface ChatRepository {
    void sendMessage(String msg);
    void setRecipient(String recipient);

    void subscribe();
    void unsubscribe();
    void destroyListener();
    void changeConnectionStatus(boolean online);
}
