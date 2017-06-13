package com.example.pomingpo.tryidlibrary.Components;

import com.example.pomingpo.tryidlibrary.Cloth;
import com.example.pomingpo.tryidlibrary.Food;
import com.example.pomingpo.tryidlibrary.Module.PackModule;

import dagger.Component;

/**
 * Created by pomingpo on 2017/6/13.
 */

@Component(modules = PackModule.class)
public interface PackComponent {
    Cloth getCloth();

    Food getFood();
}