package com.ccut.download.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhudongao on 2015/6/6.
 */
public class MyApplication  extends Application{
    private static Context mCtx;

    @Override
    public void onCreate() {
        super.onCreate();
        mCtx = this;
    }

    public static Context getContext() {
        return mCtx;
    }
}
