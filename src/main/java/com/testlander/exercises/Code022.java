package com.testlander.exercises;

public class Code022 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int i = 1;
        int sum = 0;

        while (i < number) {
            if (number % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        return sum == number;
    }
}
