package com.testlander.arrayschallenge;

import java.util.Arrays;

public class ReferenceValueTypes {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        System.out.println("after change myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("after change anotherIntArray: " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {3,4,5,6,7};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherIntArray: " + Arrays.toString(anotherIntArray));

    }

    public static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
