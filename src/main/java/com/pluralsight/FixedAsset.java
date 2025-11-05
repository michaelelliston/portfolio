package com.pluralsight;

public abstract class FixedAsset implements Valuable {

    String name;
    double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    @Override
    public abstract double getValue();


}
