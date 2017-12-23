package com.example.jh.themeswitchdemo.app;

import android.app.Application;

import com.example.jh.themeswitchdemo.theme2.utils.AppCache;
import com.example.jh.themeswitchdemo.theme2.utils.Preferences;

/**
 * Created by jinhui on 2017/6/12.
 * 邮箱: 1004260403@qq.com
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppCache.init(this);
        // 更新夜间主题
        AppCache.updateNightMode(Preferences.isNightMode());
    }
}
