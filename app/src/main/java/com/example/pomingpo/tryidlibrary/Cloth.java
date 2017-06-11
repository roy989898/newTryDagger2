package com.example.pomingpo.tryidlibrary;

/**
 * Created by pomingpo on 2017/6/11.
 */

public class Cloth {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料";
    }
}
