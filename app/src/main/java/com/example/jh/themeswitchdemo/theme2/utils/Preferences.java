package com.example.jh.themeswitchdemo.theme2.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by jinhui on 2017/6/12.
 * 邮箱: 1004260403@qq.com
 */

public class Preferences {

    private static final String NIGHT_MODE = "night_mode";

    private static Context sContext;

    public static void init(Context context) {
        sContext = context.getApplicationContext();
    }

    private static SharedPreferences getPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(sContext);
    }

    public static boolean isNightMode() {
        return getBoolean(NIGHT_MODE, false);
    }

    private static boolean getBoolean(String key, boolean defValue) {
        return getPreferences().getBoolean(key, defValue);
    }


    public static void saveNightMode(boolean on) {
        saveBoolean(NIGHT_MODE, on);
    }

    private static void saveBoolean(String key, boolean value) {
        getPreferences().edit().putBoolean(key, value).apply();
    }
}
