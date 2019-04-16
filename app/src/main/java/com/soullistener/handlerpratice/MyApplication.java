package com.soullistener.handlerpratice;

import android.app.Application;
import android.util.Log;

/**
 * @author kuan
 * Created on 2019/4/15.
 * @description
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CrashHandler.getInstance().initHandler(new CrashHandler.UncaughtExceptionCallBack() {
            @Override
            public void caughtUncaughtException(Thread t, Throwable e) {
                Log.e("CrashHandler  ","偶吼吼，抓到错误信息了"+t.getName()+e.toString());
            }
        });
    }
}
