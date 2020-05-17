package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by liubo on 2020/5/17
 */
public class MyApplication extends Application {
    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePal.initialize(context);
    }

    public Context getContext() {
        return context;
    }
}
