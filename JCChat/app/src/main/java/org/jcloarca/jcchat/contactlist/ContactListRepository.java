package org.jcloarca.jcchat.contactlist;

/**
 * Created by JCLoarca on 6/10/2016.
 */
public interface ContactListRepository {
    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void destroyListener();
    void subscribeToContactsListEvent();
    void unsubscribeToContactsListEvent();
    void changeConnectionStatus(boolean online);
}
