package org.jcloarca.jcchat.login.ui;

/**
 * Created by JCLoarca on 6/7/2016.
 */
public interface LoginView {
    void enableInputs();
    void disableInputs();
    void showProgress();
    void hideProgress();

    void handleSignup();
    void handleSignin();

    void navigateToMainScreen();
    void loginError(String error);

    void newUserSuccess();
    void newUserError(String error);
}
