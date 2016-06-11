package org.jcloarca.jcchat.contactlist;

/**
 * Created by JCLoarca on 6/10/2016.
 */
public class ContactListInteractorImpl implements ContactListInteractor {
    ContactListRepository repository;

    public ContactListInteractorImpl() {
        repository = new ContactListRepositoryImpl();
    }

    @Override
    public void subscribe() {
        repository.subscribeToContactsListEvent();
    }

    @Override
    public void unsubscribe() {
        repository.unsubscribeToContactsListEvent();
    }

    @Override
    public void destroyListener() {
        repository.destroyListener();
    }

    @Override
    public void removeContact(String email) {
        repository.removeContact(email);
    }
}
