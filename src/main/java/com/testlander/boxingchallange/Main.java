package com.testlander.boxingchallange;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");
        bank.addBranch("Isparta");
        bank.addCustomer("Isparta", "Mete", 50.05);
        bank.addCustomer("Isparta", "Celile", 120.50);
        bank.addCustomer("Isparta", "Ebru", 150.06);

        bank.addBranch("Izmir");
        bank.addCustomer("Izmir", "Nimet", 300.00);

        bank.addCustomerTransaction("Isparta", "Celile", 40.50);

        bank.listCustomers("Isparta", true);
    }
}
