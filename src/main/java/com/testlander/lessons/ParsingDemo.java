package com.testlander.lessons;

public class ParsingDemo {
    public static void main(String[] args) {
        String numberAsString = "2019";
        System.out.println("Number As String= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number= " + number);
        System.out.println("******************");
        numberAsString +=1;
        number += 1;
        System.out.println("Number As String= " + numberAsString);
        System.out.println("number= " + number);

    }
}
