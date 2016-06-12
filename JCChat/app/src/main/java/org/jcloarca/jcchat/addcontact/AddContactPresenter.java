package org.jcloarca.jcchat.addcontact;

import org.jcloarca.jcchat.addcontact.events.AddContactEvent;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
