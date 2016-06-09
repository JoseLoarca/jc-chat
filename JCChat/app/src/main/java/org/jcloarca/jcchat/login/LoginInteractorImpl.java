package org.jcloarca.jcchat.login;

/**
 * Created by JCLoarca on 6/8/2016.
 */
public class LoginInteractorImpl implements LoginInteractor{
    private LoginRepository loginRepository;

    public LoginInteractorImpl(){
        loginRepository = new LoginRepositoryImpl();
    }

    @Override
    public void chechSession() {
        loginRepository.checkSession();
    }

    @Override
    public void doSignUp(String email, String password) {
        loginRepository.signUp(email, password);
    }

    @Override
    public void doSignIn(String email, String password) {
        loginRepository.signIn(email, password);
    }
}
