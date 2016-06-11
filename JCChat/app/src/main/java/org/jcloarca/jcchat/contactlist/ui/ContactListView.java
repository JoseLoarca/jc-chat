package org.jcloarca.jcchat.contactlist.ui;

import org.jcloarca.jcchat.entities.User;

/**
 * Created by JCLoarca on 6/10/2016.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
