package com.pluralsight.finance;

import com.pluralsight.*;
import utilities.InputGetter;

public class FinanceApplication {

    public static void main(String[] args) {
        int userInput = 0;

        String ownerName = InputGetter.getString("Creating a new portfolio. Please enter your name: ");
        String portfolioName = InputGetter.getString("Please enter a name for your portfolio: ");
        Portfolio portfolio = new Portfolio(portfolioName, ownerName);

        while (userInput != 9) {
            userInput = InputGetter.getInt("\t1) Gold\n\t2) Jewelry\n\t3) House\n\t4) Bank Account\n\t5) Credit Card\n\n\t9) Exit\n\nPlease input the number that corresponds to your choice: ");

            switch (userInput) {
                case 1 -> {
                    String name = InputGetter.getString("Please enter what type of gold you are adding: ");
                    double value = InputGetter.getDouble("Please enter the value of the gold you are adding: ");
                    double weight = InputGetter.getDouble("Please enter the weight of the gold you are adding: ");

                    portfolio.add(new Gold(name, value, weight));
                }
                case 2 -> {
                    String name = InputGetter.getString("Please enter what type of jewelry you are adding: ");
                    double value = InputGetter.getDouble("Please enter the value of the jewelry you are adding: ");
                    double karat = InputGetter.getDouble("Please enter the karats of the jewelry you are adding: ");

                    portfolio.add(new Jewelry(name, value, karat));

                }
                case 3 -> {
                    String name = InputGetter.getString("Please enter a name for your house: ");
                    double value = InputGetter.getDouble("Please enter the value of your house: ");
                    int year = InputGetter.getInt("Please enter the year your house was built: ");
                    int squareFeet = InputGetter.getInt("Please enter the square footage of your house: ");
                    int bedrooms = InputGetter.getInt("Please enter the number of bedrooms in your house: ");

                    portfolio.add(new House(name, value, year, squareFeet, bedrooms));

                }
                case 4 -> {
                    String name = InputGetter.getString("Please enter the name of your bank account: ");
                    String accountNumber = InputGetter.getString("Please enter the account number of your bank account: ");
                    double balance = InputGetter.getDouble("Please enter the balance of your bank account: ");


                    portfolio.add(new BankAccount(name, accountNumber, balance));

                }
                case 5 -> {
                    String name = InputGetter.getString("Please enter the name of your credit card: ");
                    String accountNumber = InputGetter.getString("Please enter the account number of your credit card: ");
                    double balance = InputGetter.getDouble("Please enter the current balance of your credit card: ");


                    portfolio.add(new CreditCard(name, accountNumber, balance));

                }
            }
        }

        System.out.println("Total value of your assets: $" + portfolio.getValue());

        System.out.println("Highest value asset is worth: $" + portfolio.getMostValuable().getValue());

        System.out.println("Lowest value asset is worth: $" + portfolio.getLeastValuable().getValue());



    }
}
