package org.jcloarca.jcchat;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by JCLoarca on 6/7/2016.
 */
public class JCChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setupFirebase();
    }

    private void setupFirebase() {
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
