package org.jcloarca.jcchat.login;

/**
 * Created by JCLoarca on 6/7/2016.
 */
public interface LoginInteractor {
    void chechSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
