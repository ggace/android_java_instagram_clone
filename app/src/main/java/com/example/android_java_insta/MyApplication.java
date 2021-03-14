package com.example.android_java_insta;

import android.app.Application;

import com.example.android_java_insta.util.Util;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Util.init(this);
    }
}
