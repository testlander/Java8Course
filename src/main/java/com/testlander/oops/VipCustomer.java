package com.testlander.oops;

public class VipCustomer {
    /*
    - Create a new class called
    - It should have 3 fields name, credit limit, and email address.
    - Create 3 constructors,
    - 1st constructor empty should call the constructor with 3 parameters with default values.
    - 2nd constructor should pass on the 2 values it receives and add default value for the 3rd
    - 3rd constructor should save all fields.
    - Create getters only for this using code generation or intellij as setters won't be needed
    - test and confirm it works.
     */

    private String name;
    private double creditLimit;
    private  String emailAddress;

    public VipCustomer() {
        this("Default Name", 1000.0,
                "defaultname@hotmail.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 1200, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
