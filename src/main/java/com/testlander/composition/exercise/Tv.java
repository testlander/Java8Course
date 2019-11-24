package com.testlander.composition.exercise;

public class Tv {
    private String name;
    private String model;
    private String resolution;

    public Tv(String name, String model, String resolution) {
        this.name = name;
        this.model = model;
        this.resolution = resolution;
    }

    public boolean isHd() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getResolution() {
        return resolution;
    }
}
