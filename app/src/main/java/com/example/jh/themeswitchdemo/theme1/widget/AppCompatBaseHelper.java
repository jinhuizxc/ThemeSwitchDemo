package com.example.jh.themeswitchdemo.theme1.widget;

import android.util.AttributeSet;
import android.view.View;

import com.example.jh.themeswitchdemo.theme1.utils.TintManager;

/**
 * Created by jinhui on 2017/6/11.
 * 邮箱: 1004260403@qq.com
 */

public abstract class AppCompatBaseHelper {

    protected View mView;
    protected TintManager mTintManager;

    private boolean mSkipNextApply;

    public AppCompatBaseHelper(View view, TintManager tintManager) {
        mView = view;
        mTintManager = tintManager;
    }

    protected boolean skipNextApply() {
        if (mSkipNextApply) {
            mSkipNextApply = false;
            return true;
        }
        mSkipNextApply = true;
        return false;
    }

    protected void setSkipNextApply(boolean flag) {
        mSkipNextApply = flag;
    }

    abstract void loadFromAttribute(AttributeSet attrs, int defStyleAttr);

    public abstract void tint();
}

