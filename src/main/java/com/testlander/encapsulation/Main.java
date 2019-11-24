package com.testlander.encapsulation;

public class Main {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Tim", 520, "Sword");
        System.out.println(player.getHitPoints());
    }
}
