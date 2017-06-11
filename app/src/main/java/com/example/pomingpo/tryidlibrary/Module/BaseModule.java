package com.example.pomingpo.tryidlibrary.Module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

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
}
