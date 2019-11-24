package com.testlander.exercises;

public class Code015 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        number = Math.abs(number);
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number = number / 10;
        }

        if (temp < 0) {
            reverse = reverse * -1;
        }

        if (temp == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
