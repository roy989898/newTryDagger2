package com.example.pomingpo.tryidlibrary.Module;

import android.content.Context;

import com.example.pomingpo.tryidlibrary.Cloth;
import com.example.pomingpo.tryidlibrary.Clothes;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pomingpo on 2017/6/11.
 */

@Module
public class MainModule {
    @Provides
    @Named("red")
    public Cloth getredCloth(Context context) {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @Named("blue")
    public Cloth getblueCloth(Context context) {
        Cloth cloth = new Cloth();
        cloth.setColor("blue");
        return cloth;
    }

    @Provides
    public Clothes getClothes(@Named("red") Cloth cloth) {
        return new Clothes(cloth);
    }
}
