package org.jcloarca.jcchat.lib;

/**
 * Created by JCLoarca on 6/8/2016.
 */
public class GreenRobotEventBus implements EventBus {
    de.greenrobot.event.EventBus eventBus;

    private static class SingletonHolder{
        private static final GreenRobotEventBus INSTANCE = new GreenRobotEventBus();
    }

    public static GreenRobotEventBus getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public GreenRobotEventBus(){
        this.eventBus = de.greenrobot.event.EventBus.getDefault();
    }

    @Override
    public void register(Object subscriber) {
        eventBus.register(subscriber);
    }

    @Override
    public void unregister(Object subscriber) {
        eventBus.unregister(subscriber);
    }

    @Override
    public void post(Object event) {
        eventBus.post(event);
    }
}
