package org.jcloarca.jcchat.chat;

import org.greenrobot.eventbus.Subscribe;
import org.jcloarca.jcchat.chat.events.ChatEvent;
import org.jcloarca.jcchat.chat.ui.ChatView;
import org.jcloarca.jcchat.entities.User;
import org.jcloarca.jcchat.lib.EventBus;
import org.jcloarca.jcchat.lib.GreenRobotEventBus;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public class ChatPresenterImpl implements ChatPresenter {
    private EventBus eventBus;
    private ChatView view;
    private ChatInteractor chatInteractor;
    private ChatSessionInteractor sessionInteractor;

    public ChatPresenterImpl(ChatView view) {
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.chatInteractor = new ChatInteractorImpl();
        this.sessionInteractor = new ChatSessionInteractorImpl();
    }

    @Override
    public void onPause() {
        chatInteractor.unsubscribe();
        sessionInteractor.changeConnectionStatus(User.OFFLINE);
    }

    @Override
    public void onResume() {
        chatInteractor.subscribe();
        sessionInteractor.changeConnectionStatus(User.ONLINE);
    }

    @Override
    public void onCreate() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        eventBus.unregister(this);
        chatInteractor.destroyListener();
        view = null;
    }

    @Override
    public void setChatRecipient(String recipient) {
        chatInteractor.setRecipient(recipient);
    }

    @Override
    public void sendMessage(String msg) {
        chatInteractor.sendMessage(msg);
    }

    @Override
    @Subscribe
    public void onEventMainThread(ChatEvent event) {
        if(view != null){
            view.onMessageReceived(event.getMessage());
        }
    }
}
