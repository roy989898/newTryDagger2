package com.example.pomingpo.tryidlibrary.Module;

import com.example.pomingpo.tryidlibrary.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pomingpo on 2017/6/13.
 */

@Module
public class UserModule {

    @Singleton
    @Provides
    public User provideUser() {
        return new User();
    }
}
