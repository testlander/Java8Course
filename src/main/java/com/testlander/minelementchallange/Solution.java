package com.testlander.minelementchallange;

import java.util.Scanner;

public class Solution {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] lastArray = readIntegers(count);
        int minNumber = findMin(lastArray);

        System.out.println(minNumber);

//        for (int a:lastArray
//             ) {
//            System.out.println(a);
//        }

    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value< min) {
                min = value;
            }
        }
        return min;
    }

    public static int[] readIntegers(int count) {
        
        int[] array = new int[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
}
