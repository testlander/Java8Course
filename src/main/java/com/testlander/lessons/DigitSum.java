package com.testlander.lessons;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int num) {
        int sumNum = 0;
        if (num < 10) {
            return -1;
        } else {
            while (num > 0) {
                int digit = num % 10;
                sumNum += digit;
                num = num / 10;
            }
        }
        return sumNum;
    }
}
