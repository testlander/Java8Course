package com.testlander.oops;

public class AccountDemo {

    public static void main(String[] args) {
        /*
        - Create a new class for a bank account
        - Create fields for the account number, balance, customer name, email and phone number.

        - Create getters and setters for each field
        - Create two additional methods
        - 1. To allow the customer to deposit funds (this should increment the balance field).
        - 2. To allow the customer to withdraw funds. This should deduct from the balance field,
             but not allow the withdrawal to complete if their are insufficient funds.
        - You will want to create various code in the Main class (the one created by IntelliJ) to
          confirm your code is working.
        - Add some System.out.println's in the two methods above as well.
         */

        Account bobsAccount = new Account();
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(500.0);
        bobsAccount.withdrawal(501.0);
        bobsAccount.withdrawal(50.0);

        Account janesAccount = new Account("1234", 400.0, "Jane Witch", "janewitch@hotmail.com", "07379791791");
        janesAccount.withdrawal(2000.0);
        janesAccount.deposit(120.0);

        Account markAccount = new Account();
        System.out.println(markAccount.getBalance());

        Account timsAccount = new Account("Tim Black", "team@hotmail.com", "07333123321");
        System.out.println("Tim's account number: " + timsAccount.getNumber());
    }
}
