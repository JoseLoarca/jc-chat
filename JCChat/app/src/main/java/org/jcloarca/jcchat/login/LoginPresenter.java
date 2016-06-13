package org.jcloarca.jcchat.login;

import org.jcloarca.jcchat.login.events.LoginEvent;

/**
 * Created by JCLoarca on 6/7/2016.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onResume();
    void onPause();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
