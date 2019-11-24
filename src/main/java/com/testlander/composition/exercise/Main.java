package com.testlander.composition.exercise;

public class Main {
    public static void main(String[] args) {
        Furniture furniture = new Furniture(2, 5, 1);
        Tv tv = new Tv("LG", "Ultra4K", "1980*1200");

        LivingRoom livingRoom = new LivingRoom(tv, furniture);

        System.out.println(livingRoom.getTv().isHd());
        livingRoom.getFurniture().nameSofaModel();
    }
}
