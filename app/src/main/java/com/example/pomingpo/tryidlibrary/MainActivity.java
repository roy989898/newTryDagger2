package com.example.pomingpo.tryidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.pomingpo.tryidlibrary.Components.DaggerPackComponent;
import com.example.pomingpo.tryidlibrary.Components.DaggerUserComponent;
import com.example.pomingpo.tryidlibrary.Module.PackModule;
import com.example.pomingpo.tryidlibrary.Module.UserModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private TextView tvShow;

    @Inject
    User user;

    @Inject
    Cloth cloth;

    @Inject
    Food food;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  MainComponent build = DaggerMainComponent.builder().baseModule(new BaseModule(this)).mainModule(new MainModule()).build();
        build.inject(this);*/
        DaggerUserComponent.builder().packComponent(DaggerPackComponent.builder().packModule(new PackModule()).build()).userModule(new UserModule()).build().inject(this);

        tvShow = (TextView) findViewById(R.id.tv_show);


    }
}
