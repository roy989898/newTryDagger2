package com.example.pomingpo.tryidlibrary.Module;

import android.content.Context;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by pomingpo on 2017/6/11.
 */

@Module
public class BaseModule {
    private Context context;

    public BaseModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context getContext() {
        return context;
    }

    @Singleton
    @Provides
    public OkHttpClient getOkHttpClient() {
        return new OkHttpClient();
    }

    @Singleton
    @Provides
    public EventBus getDefaultEventBus() {
        return EventBus.getDefault();
    }


}
