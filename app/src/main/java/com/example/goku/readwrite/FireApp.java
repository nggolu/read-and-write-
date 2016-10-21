package com.example.goku.readwrite;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by goku on 21/10/16.
 */

public class FireApp extends Application {
    @Override
    public void onCreate()
    {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
