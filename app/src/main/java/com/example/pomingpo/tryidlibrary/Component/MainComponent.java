package com.example.pomingpo.tryidlibrary.Component;

import com.example.pomingpo.tryidlibrary.MainActivity;
import com.example.pomingpo.tryidlibrary.Module.MainModule;

import dagger.Component;

/**
 * Created by pomingpo on 2017/6/11.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
