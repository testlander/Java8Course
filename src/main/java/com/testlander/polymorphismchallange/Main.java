package com.testlander.polymorphismchallange;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car --> startEngine()";
    }

    public String accelerate() {
        return "Car --> accelerate()";
    }

    public String brake() {
        return "Car --> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford --> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford --> brake()";
    }
}

class Honda extends Car {

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda --> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda --> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("*********************");
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("*********************");
        Ford ford = new Ford(6, "Ford Mustang");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("*********************");
        Honda honda = new Honda(6, "Ford Mustang");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
    }
}
