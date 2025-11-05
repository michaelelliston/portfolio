package com.pluralsight;

public interface Valuable extends Comparable<Valuable> {

    double getValue();

    default int compareTo(Valuable asset) {
        return Double.compare(this.getValue(), asset.getValue());
    }
}
