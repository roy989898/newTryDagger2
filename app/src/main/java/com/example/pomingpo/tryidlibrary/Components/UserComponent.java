package com.example.pomingpo.tryidlibrary.Components;

import com.example.pomingpo.tryidlibrary.MainActivity;
import com.example.pomingpo.tryidlibrary.Module.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pomingpo on 2017/6/13.
 */

@Singleton
@Component(dependencies = PackComponent.class, modules = UserModule.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
