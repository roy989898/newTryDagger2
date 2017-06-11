package com.example.pomingpo.tryidlibrary.Module;

import com.example.pomingpo.tryidlibrary.Cloth;
import com.example.pomingpo.tryidlibrary.Clothes;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pomingpo on 2017/6/11.
 */

@Module
public class MainModule {
    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    public Clothes getClothes(Cloth cloth) {
        return new Clothes(cloth);
    }
}
