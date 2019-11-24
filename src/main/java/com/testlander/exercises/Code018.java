package com.testlander.exercises;

public class Code018 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(15, 155));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }
        int xa, xb, ya, yb = 0;

        xa = x % 10;
        xb = x / 10;
        ya = y % 10;
        yb = y / 10;

        if ((xa == ya || xa == yb) || (xb == ya || xb == yb)) {
            return true;
        } else {
            return false;
        }
    }
}
