package com.testlander.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

//        dog.eat();
//        animal.eat();
        dog.walk();
        //dog.run();

//        Animal xx = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
//
//        xx.eat();
//        System.out.println(xx.getName());
    }
}
