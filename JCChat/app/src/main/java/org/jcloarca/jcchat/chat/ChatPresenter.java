package org.jcloarca.jcchat.chat;

import org.jcloarca.jcchat.chat.events.ChatEvent;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public interface ChatPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String recipient);
    void sendMessage(String msg);
    void onEventMainThread(ChatEvent event);
}
