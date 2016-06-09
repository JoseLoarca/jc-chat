package org.jcloarca.jcchat.login;

/**
 * Created by JCLoarca on 6/7/2016.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
}
