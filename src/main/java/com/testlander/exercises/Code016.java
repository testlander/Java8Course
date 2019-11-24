package com.testlander.exercises;

public class Code016 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0;
        int firstDigit = 0;

        if (number < 0) {
            return -1;
        }
        if (number< 10) {
            lastDigit = number;
            firstDigit = number;
        } else {
            lastDigit = number % 10;
        }

        while (number >= 10) {
            number = number / 10;
            if (number < 10) {
                firstDigit = number;
                break;
            }
        }
        return firstDigit + lastDigit;
    }
}
