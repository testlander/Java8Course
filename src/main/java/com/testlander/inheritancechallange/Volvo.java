package com.testlander.inheritancechallange;

public class Volvo extends Car{
    private int roadServiceMonths;

    public Volvo(int roadServiceMonths) {
        super("Volvo", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
    }
}
