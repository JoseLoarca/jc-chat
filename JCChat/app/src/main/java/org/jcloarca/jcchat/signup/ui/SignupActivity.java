package org.jcloarca.jcchat.signup.ui;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import org.jcloarca.jcchat.R;
import org.jcloarca.jcchat.contactlist.ui.ContactListActivity;
import org.jcloarca.jcchat.login.LoginPresenter;
import org.jcloarca.jcchat.login.LoginPresenterImpl;
import org.jcloarca.jcchat.login.ui.LoginView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignupActivity extends AppCompatActivity implements LoginView {
    @Bind(R.id.txtEmail)
    EditText inputEmail;
    @Bind(R.id.txtPassword)
    EditText inputPassword;
    @Bind(R.id.btnSignup)
    Button btnSignup;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    @Bind(R.id.layoutMainContainer)
    RelativeLayout container;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);

        setTitle(R.string.signup_title);

        loginPresenter = new LoginPresenterImpl(this);
        loginPresenter.onCreate();
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();

        loginPresenter.onResume();
    }

    @Override
    protected void onPause() {
        loginPresenter.onPause();
        super.onPause();
    }

    @Override
    public void enableInputs() {
        setInputs(true);
    }

    @Override
    public void disableInputs() {
        setInputs(false);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @OnClick(R.id.btnSignup)
    @Override
    public void handleSignup() {
        loginPresenter.registerNewUser(inputEmail.getText().toString(),
                                        inputPassword.getText().toString());
    }

    @Override
    public void handleSignin() {
        throw new UnsupportedOperationException("Operation not valid in signup.");
    }

    @Override
    public void navigateToMainScreen() {
        startActivity(new Intent(this, ContactListActivity.class));
    }

    @Override
    public void loginError(String error) {
        throw new UnsupportedOperationException("Operation not valid in signup.");
    }

    @Override
    public void newUserSuccess() {
        Snackbar.make(container, R.string.login_notice_message_signup, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void newUserError(String error) {
        inputPassword.setText("");
        String msgError = String.format(getString(R.string.login_error_message_signup), error);
        inputPassword.setError(msgError);
    }

    private void setInputs(boolean enabled) {
        inputEmail.setEnabled(enabled);
        inputPassword.setEnabled(enabled);
        btnSignup.setEnabled(enabled);
    }
}
