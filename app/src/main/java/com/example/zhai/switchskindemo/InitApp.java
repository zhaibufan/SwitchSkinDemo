package com.example.zhai.switchskindemo;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by Mastra on 2017/12/2.
 *
 * InitApp的AppTheme必须继承Theme.AppCompat.Light.DarkActionBar这个主题
 */

public class InitApp extends Application {

    public static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this.getApplicationContext();
        initAppTheme();
    }

    private void initAppTheme() {
        SettingUtils settingUtils = SettingUtils.getInstance();
        if (settingUtils.isNightMode()) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
