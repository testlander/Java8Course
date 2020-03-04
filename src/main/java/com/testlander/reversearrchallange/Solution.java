package com.testlander.reversearrchallange;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        //int[] array = {1,2,3};
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("First Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
