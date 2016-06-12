package org.jcloarca.jcchat.addcontact.events;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public class AddContactEvent {
    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
