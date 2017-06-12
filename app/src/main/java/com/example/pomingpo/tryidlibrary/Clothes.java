package com.example.pomingpo.tryidlibrary;

/**
 * Created by pomingpo on 2017/6/11.
 */

public class Clothes {
    private Material cloth;

    public Clothes(Material cloth) {
        this.cloth = cloth;
    }

    public Material getCloth() {
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }
}