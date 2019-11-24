package com.testlander.lessons;

import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - year;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your age is " + age);
            } else {
                System.out.println("Invalid year of birth!");
            }
        } else {
            System.out.println("Unable to parse year of birth!");
        }
        scanner.close();
    }
}
