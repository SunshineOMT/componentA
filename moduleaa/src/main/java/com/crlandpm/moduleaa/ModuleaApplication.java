package com.crlandpm.moduleaa;

import android.content.Context;

import com.hm.iou.lifecycle.annotation.AppLifecycle;
import com.hm.lifecycle.api.IApplicationLifecycleCallbacks;

/**
 * Author: Danny Yang
 * Date: 2022/02/22/3:19 下午
 */
@AppLifecycle
public class ModuleaApplication implements IApplicationLifecycleCallbacks {
    public Context context;

    @Override
    public int getPriority() {
        return NORM_PRIORITY;
    }

    @Override
    public void onCreate(Context context) {
        this.context = context;
    }

    @Override
    public void onTerminate() { }

    @Override
    public void onLowMemory() { }

    @Override
    public void onTrimMemory(int level) { }
}
