package com.example.jh.themeswitchdemo.theme2.utils;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by jinhui on 2017/6/12.
 * 邮箱: 1004260403@qq.com
 */

public class AppCache {

    private Context mContext;

    // 单例模式
    private static AppCache getInstance(){
        return  SingletonHolder.sAppCache;
    }
    private static class SingletonHolder{
        private static AppCache sAppCache = new AppCache();
    }

    public static Context getContext() {
        return getInstance().mContext;
    }

    // 初始化
    public static void init(Application application) {
        getInstance().onInit(application);
    }

    private void onInit(Application application) {
        mContext = application.getApplicationContext();
        Preferences.init(mContext);
    }

    // 更改主题
    public static void updateNightMode(boolean on) {
        Resources resources = getContext().getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        config.uiMode &= ~Configuration.UI_MODE_NIGHT_MASK;
        config.uiMode |= on ? Configuration.UI_MODE_NIGHT_YES : Configuration.UI_MODE_NIGHT_NO;
        resources.updateConfiguration(config, dm);
    }


}
