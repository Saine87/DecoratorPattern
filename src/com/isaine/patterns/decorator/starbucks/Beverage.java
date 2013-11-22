package com.isaine.patterns.decorator.starbucks;

public abstract class Beverage {

    protected String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
