package org.jcloarca.jcchat.login;

import android.util.Log;

import org.jcloarca.jcchat.domain.FirebaseHelper;
import org.jcloarca.jcchat.lib.EventBus;
import org.jcloarca.jcchat.lib.GreenRobotEventBus;
import org.jcloarca.jcchat.login.events.LoginEvent;

/**
 * Created by JCLoarca on 6/8/2016.
 */
public class LoginRepositoryImpl implements LoginRepository {
    private FirebaseHelper helper;

    public LoginRepositoryImpl(){
        this.helper = FirebaseHelper.getInstance();
    }

    @Override
    public void signUp(String email, String password) {
        postEvent(LoginEvent.onSignUpSuccess);
    }

    @Override
    public void signIn(String email, String password) {
        postEvent(LoginEvent.onSignInSuccess);
    }

    @Override
    public void checkSession() {
        postEvent(LoginEvent.onFailedToRecoverSession);
    }

    private void postEvent (int type, String errorMessage){
        LoginEvent loginEvent = new LoginEvent();
        loginEvent.setEventType(type);
        if(errorMessage!=null){
            loginEvent.setErrorMessage(errorMessage);
        }

        EventBus eventBus = GreenRobotEventBus.getInstance();
        eventBus.post(loginEvent);
    }

    private void postEvent (int type){
        postEvent(type, null);
    }
}
