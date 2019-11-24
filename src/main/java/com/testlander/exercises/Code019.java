package com.testlander.exercises;

public class Code019 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
            return false;
        }
        int xa = x % 10;
        int ya = y % 10;
        int za = z % 10;

        if (xa == ya || xa == za || ya == za) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }
}
