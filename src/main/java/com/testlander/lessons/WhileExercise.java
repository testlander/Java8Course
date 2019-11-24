package com.testlander.lessons;

public class WhileExercise {
    public static void main(String[] args) {
        int startNumber = 4;
        int endNumber = 20;
        int total = 0;
        int count = 0;


        while (startNumber <= endNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;
            }
            total += startNumber;
            System.out.println("Even number: " + startNumber);
            count ++;
            if (count == 5) {
                break;
            }
        }
        System.out.println("Total of even numbers: " + total);
        System.out.println("Count: " + count);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
