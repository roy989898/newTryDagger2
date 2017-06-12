package com.example.pomingpo.tryidlibrary.APi;

import okhttp3.OkHttpClient;

/**
 * Created by pomingpo on 2017/6/12.
 */

public class ApiManager {
    private OkHttpClient okHttpClient;

    public ApiManager(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }


}
