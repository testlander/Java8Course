package com.testlander.inheritance2;

public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

//        System.out.println(blueHouse.getColor());
//        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("red");
//        System.out.println(blueHouse.getColor());
//        System.out.println(anotherHouse.getColor());

        House yellowHouse = new House("yellow");
        anotherHouse = yellowHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(yellowHouse.getColor());

    }
}
