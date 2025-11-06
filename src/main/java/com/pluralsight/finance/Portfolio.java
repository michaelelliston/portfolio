package com.pluralsight.finance;

import com.pluralsight.Valuable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<Valuable>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double totalValue = 0;
        for (Valuable asset : assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {

        Collections.sort(assets);

        return assets.get(assets.size() - 1);
    }

    public Valuable getLeastValuable() {

        Collections.sort(assets);

        return assets.get(0);
    }

}
