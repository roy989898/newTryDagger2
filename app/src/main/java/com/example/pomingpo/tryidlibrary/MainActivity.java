package com.example.pomingpo.tryidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.pomingpo.tryidlibrary.APi.ApiManager;
import com.example.pomingpo.tryidlibrary.Component.DaggerMainComponent;
import com.example.pomingpo.tryidlibrary.Component.MainComponent;
import com.example.pomingpo.tryidlibrary.Module.BaseModule;
import com.example.pomingpo.tryidlibrary.Module.MainModule;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private TextView tvShow;
    @Inject
    @Named("red")
    Cloth redCloth;

    @Inject
    @Named("blue")
    Cloth blueCloth;

    @Inject
    @Named("blue")
    Cloth blueCloth2;

    @Inject
    Shoes shoes;


    @Inject
    Clothes clothes;

    @Inject
    ApiManager mApiManager;

    @Inject
    ApiManager mApiManager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainComponent build = DaggerMainComponent.builder().baseModule(new BaseModule(this)).mainModule(new MainModule()).build();
        build.inject(this);

        tvShow = (TextView) findViewById(R.id.tv_show);

        tvShow.setText("我现在有" + redCloth + blueCloth + "和" + shoes + " " + clothes);
        mApiManager.toString();
    }
}
