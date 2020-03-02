package com.testlander.arrayschallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = getIntegers(3);
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);


    }

    public static  int[] getIntegers(int capacity) {

        int[] myArray = new int[capacity];
        System.out.println("Enter " + capacity + " numbers:" );
        for (int i = 0; i < capacity; i++) {

            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] myArray) {
        for (int i:myArray
        ) {
            System.out.println(i);
        }
    }

    public static int[] sortIntegers(int[] myArray) {

//        int[] sortedArray = new int[myArray.length];
//        for (int i = 0; i < myArray.length; i++) {
//            sortedArray[i] = myArray[i];
//        }

        int[] sortedArray = Arrays.copyOf(myArray, myArray.length);

        boolean result = true;
        int temp;

        while (result) {
            result = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    result = true;
                }
            }
        }
        return sortedArray;
    }
}
