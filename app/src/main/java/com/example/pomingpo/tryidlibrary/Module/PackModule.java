package com.example.pomingpo.tryidlibrary.Module;

import com.example.pomingpo.tryidlibrary.Cloth;
import com.example.pomingpo.tryidlibrary.Food;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pomingpo on 2017/6/13.
 */

@Module
public class PackModule {
    @Provides
    Cloth provideCloth() {
        return new Cloth();
    }

    @Provides
    Food provideFood() {
        return new Food();
    }
}
