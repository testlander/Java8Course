package com.testlander.lessons;

public class SwitchExercise {
    public static void main(String[] args) {

        String month = "JANUARY";

        switch (month.toLowerCase()) {
            case "january":
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");

        }
    }
}
