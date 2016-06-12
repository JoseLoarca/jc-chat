package org.jcloarca.jcchat.addcontact;

import org.greenrobot.eventbus.Subscribe;
import org.jcloarca.jcchat.addcontact.events.AddContactEvent;
import org.jcloarca.jcchat.addcontact.ui.AddContactView;
import org.jcloarca.jcchat.lib.EventBus;
import org.jcloarca.jcchat.lib.GreenRobotEventBus;

/**
 * Created by JCLoarca on 6/11/2016.
 */
public class AddContactPresenterImpl implements AddContactPresenter {
    EventBus eventBus;
    AddContactView view;
    AddContactInteractor interactor;

    public AddContactPresenterImpl(AddContactView view) {
        this.eventBus = GreenRobotEventBus.getInstance();
        this.view = view;
        this.interactor = new AddContactInteractorImpl();
    }

    @Override
    public void onShow() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        view = null;
        eventBus.unregister(this);
    }

    @Override
    public void addContact(String email) {
        if(view != null){
            view.hideInput();
            view.showProgress();
        }
        interactor.execute(email);
    }

    @Override
    @Subscribe
    public void onEventMainThread(AddContactEvent event) {
        if(view != null){
            view.hideProgress();
            view.showInput();

            if(event.isError()){
                view.contactNotAdded();
            }else{
                view.contactAdded();
            }
        }
    }
}
