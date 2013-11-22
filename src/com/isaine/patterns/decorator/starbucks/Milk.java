package com.isaine.patterns.decorator.starbucks;

public class Milk extends CondimentDecorator {

    private final Beverage beverage;

    public Milk( Beverage beverage ) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", milk.";
    }

    public double cost() {
        return beverage.cost() + 0.5;
    }
}
