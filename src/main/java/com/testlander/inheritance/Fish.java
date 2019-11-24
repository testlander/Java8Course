package com.testlander.inheritance;

public class Fish extends Animal{
    private int gills;
    private int eyses;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyses, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyses = eyses;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
