package com.testlander.lessons;

public class WhileDemo {
    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for (int i = 0; i <= 5; i++) {
//            System.out.println("i: " + i);
//        }
//        System.out.println("****************************");
//        int i = 0;
//        while (i <= 5) {
//            System.out.println("i: " + i);
//            i++;
//        }

        int number = 0;

        while (number < 15) {
            number++;

            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue;
            }

            System.out.println("number: " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }

    }
}
