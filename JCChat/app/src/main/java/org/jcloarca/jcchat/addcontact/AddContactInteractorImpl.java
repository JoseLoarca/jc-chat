package org.jcloarca.jcchat.addcontact;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public class AddContactInteractorImpl implements AddContactInteractor {
    AddContactRepository repository;

    public AddContactInteractorImpl() {
        repository = new AddContactRepositoryImpl();
    }

    @Override
    public void execute(String email) {
        repository.addContact(email);
    }
}
