package com.testlander.composition.exercise;

public class LivingRoom {
    private Tv tv;
    private Furniture furniture;

    public LivingRoom(Tv tv, Furniture furniture) {
        this.tv = tv;
        this.furniture = furniture;
    }

    public Tv getTv() {
        return tv;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
