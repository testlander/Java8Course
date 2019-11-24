package com.testlander.composition;

public class Car extends Vehicle{
    /*
    Car IS A vehicle.
     */

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
