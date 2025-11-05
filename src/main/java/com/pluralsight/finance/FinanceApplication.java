package com.pluralsight.finance;

import com.pluralsight.FixedAsset;
import com.pluralsight.Gold;
import com.pluralsight.Jewelry;
import com.pluralsight.Valuable;
import utilities.InputGetter;

public class FinanceApplication {

    public static void main(String[] args) {
        int userInput = 0;

        String ownerName = InputGetter.getString("Creating a new portfolio. Please enter your name: ");
        String portfolioName = InputGetter.getString("Please enter a name for your portfolio: ");
        Portfolio portfolio = new Portfolio(portfolioName, ownerName);

        while (userInput != 9) {
            userInput = InputGetter.getInt("\t1) Gold\n\t2) Jewelry\n\t3) House\n\t4) Bank Account\n\t5) Credit Card\n\n\t99) Exit\n\nPlease input the number that corresponds to your choice: ");

            switch (userInput) {
                case 1 -> {
                    String name = InputGetter.getString("Please enter what type of gold you are adding: ");
                    double value = InputGetter.getDouble("Please enter the value of the gold you are adding: ");
                    double weight = InputGetter.getDouble("Please enter the weight of the gold you are adding: ");

                    portfolio.add(new Gold(name, value, weight));
                }
                case 2 -> {


//                    TODO: Continue writing code from here
//                    portfolio.add(new Jewelry())

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
            }
        }



    }
}
