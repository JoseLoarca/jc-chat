package org.jcloarca.jcchat.contactlist.ui.adapters;

import org.jcloarca.jcchat.entities.User;

/**
 * Created by JCLoarca on 6/10/2016.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
