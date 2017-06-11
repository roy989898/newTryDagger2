package com.example.pomingpo.tryidlibrary.Component;

import android.content.Context;

import com.example.pomingpo.tryidlibrary.Module.BaseModule;

import dagger.Component;
import dagger.Provides;

/**
 * Created by pomingpo on 2017/6/11.
 */


@Component(modules = BaseModule.class)
public interface BaseComponent {

    Context getContext();
}
