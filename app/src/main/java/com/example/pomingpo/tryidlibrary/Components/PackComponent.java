package com.example.pomingpo.tryidlibrary.Components;

import com.example.pomingpo.tryidlibrary.Module.PackModule;
import com.example.pomingpo.tryidlibrary.Module.UserModule;

import dagger.Component;

/**
 * Created by pomingpo on 2017/6/13.
 */

@Component(modules = PackModule.class)
public interface PackComponent {

    UserComponent userComponent(UserModule userModule);
}