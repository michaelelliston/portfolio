package com.pluralsight.finance;

import com.pluralsight.Valuable;

public class CreditCard implements Valuable {

    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount) {
        this.balance -= amount;
    }

    public void pay(double amount) {
        this.balance += amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
