package com.testlander.exercises;

import java.math.BigInteger;

public class Code020 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(30, 12));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int gcd = 1;

        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
