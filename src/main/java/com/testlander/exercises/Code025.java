package com.testlander.exercises;

public class Code025 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) return -1;
        int count = 2;

        while (number > 1) {
            if (number % count ==0) {
                number /= count;
            } else
                count ++;
        }
        return count;
    }
}
