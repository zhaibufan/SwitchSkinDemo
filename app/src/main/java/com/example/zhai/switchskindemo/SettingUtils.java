package com.example.zhai.switchskindemo;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Mastra on 2017/12/2.
 */

public class SettingUtils {

    private SharedPreferences mSp = PreferenceManager.getDefaultSharedPreferences(InitApp.appContext);
    private static final String NIGHT_MODE = "night_mode";

    private SettingUtils() {
    }

    public static SettingUtils getInstance() {
        return SettingUtilsInstance.instance;
    }

    private static final class SettingUtilsInstance {
        private static final SettingUtils instance = new SettingUtils();
    }

    public boolean isNightMode() {
        return mSp.getBoolean(NIGHT_MODE, false);
    }

    public void saveNightMode(boolean mode) {
        mSp.edit().putBoolean(NIGHT_MODE, mode).commit();
    }
}
