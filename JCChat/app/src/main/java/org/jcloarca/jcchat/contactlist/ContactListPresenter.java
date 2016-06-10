package org.jcloarca.jcchat.contactlist;

import org.jcloarca.jcchat.contactlist.events.ContactListEvent;

/**
 * Created by JCLoarca on 6/10/2016.
 */
public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
