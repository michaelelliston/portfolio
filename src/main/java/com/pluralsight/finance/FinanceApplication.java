package com.pluralsight.finance;

import com.pluralsight.Valuable;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12_500);
        Valuable account2 = new BankAccount("Gary", "456", 1_500);

        account1.deposit(100);
//        account2.deposit(100);   Does not work, unless you verify account2 is an instance of BankAccount.
    }
}
