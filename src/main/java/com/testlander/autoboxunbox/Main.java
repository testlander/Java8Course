package com.testlander.autoboxunbox;

import java.util.ArrayList;


class IntClass { //We created a wrapper class.
    private int myIntValue;

    public IntClass(int myIntValue) {
        this.myIntValue = myIntValue;
    }

    public int getMyIntValue() {
        return myIntValue;
    }

    public void setMyIntValue(int myIntValue) {
        this.myIntValue = myIntValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Mete");

        //ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(56));
        Integer integer = new Integer(56);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //==>Autoboxing
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //Unboxing
        }

        Integer myIntValue = 56; //Compile time 56 --> Integer.valueOf(56)
        int myInt = myIntValue; //myIntValue.intValue(); //Unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); //Autoboxing
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); //unboxing
            System.out.println(i + " --> " + value);
        }
    }
}
