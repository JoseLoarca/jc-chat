package org.jcloarca.jcchat.contactlist;

/**
 * Created by JCLoarca on 6/10/2016.
 */
public interface ContactListInteractor {
    void subscribe();
    void unsubscribe();
    void destroyListener();
    void removeContact(String email);
}
