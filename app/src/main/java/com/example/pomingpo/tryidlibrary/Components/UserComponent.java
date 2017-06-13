package com.example.pomingpo.tryidlibrary.Components;

import com.example.pomingpo.tryidlibrary.MainActivity;
import com.example.pomingpo.tryidlibrary.Module.UserModule;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by pomingpo on 2017/6/13.
 */

@Singleton
@Subcomponent(modules = UserModule.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
