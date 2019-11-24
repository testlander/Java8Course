package com.testlander.exercises;

import java.util.Scanner;

public class Code027 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double avg = 0;
        double count = 1;

        while (true) {
            boolean isAnInteger = scanner.hasNextInt();

            if (isAnInteger) {
                int number = scanner.nextInt();
                sum += number;
                avg =  (sum / count);
                avg = Math.round(avg);
                count++;

            } else {
                if (count == 1) {
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                } else {
                    break;
                }
            }
        }
        if (count > 1) {
            System.out.println("SUM = " + (int) sum + " AVG = " + (int) avg);
        }
    }
}
