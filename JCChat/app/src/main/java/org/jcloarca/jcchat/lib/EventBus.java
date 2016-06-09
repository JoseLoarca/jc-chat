package org.jcloarca.jcchat.lib;

/**
 * Created by JCLoarca on 6/8/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
