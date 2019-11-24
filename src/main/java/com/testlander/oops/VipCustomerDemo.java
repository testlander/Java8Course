package com.testlander.oops;

public class VipCustomerDemo {

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        System.out.println("******************");
        VipCustomer customer2 = new VipCustomer("Tom", "tom@hotmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmailAddress());
        System.out.println(customer2.getCreditLimit());
    }
}
