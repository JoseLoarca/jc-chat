package org.jcloarca.jcchat.addcontact.ui;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public interface AddContactView {
    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}
