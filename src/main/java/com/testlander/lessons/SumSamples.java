package com.testlander.lessons;

public class SumSamples {

    public static void main(String[] args) {
        System.out.println(sum(2, 5));
        System.out.println(sum(3, 4, 1));

        System.out.println("Hello");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
