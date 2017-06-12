package com.example.pomingpo.tryidlibrary.APi;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.OkHttpClient;

/**
 * Created by pomingpo on 2017/6/12.
 */


@Singleton
public class ApiManager {
    private OkHttpClient okHttpClient;

    @Inject
    public ApiManager(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }


}
