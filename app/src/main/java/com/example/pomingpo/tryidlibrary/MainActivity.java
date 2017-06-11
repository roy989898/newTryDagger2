package com.example.pomingpo.tryidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.pomingpo.tryidlibrary.Component.DaggerMainComponent;
import com.example.pomingpo.tryidlibrary.Component.MainComponent;
import com.example.pomingpo.tryidlibrary.Module.MainModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private TextView tvShow;
    @Inject
    Cloth cloth;

    @Inject
    Shoes shoes;


    @Inject
    Clothes clothes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        build.inject(this);

        tvShow = (TextView) findViewById(R.id.tv_show);

        tvShow.setText("我现在有" + cloth + "和" + shoes + " " + clothes);
    }
}
