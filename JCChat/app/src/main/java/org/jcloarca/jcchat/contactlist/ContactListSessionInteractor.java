package org.jcloarca.jcchat.contactlist;

/**
 * Created by JCLoarca on 6/10/2016.
 */
public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
