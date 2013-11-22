package com.isaine.patterns.decorator.starbucks;

public class Starbucks {

    public static void main( String[] args ) {

        Beverage beverage1 = new Espresso();

        System.out.println( beverage1.getDescription() + " cost: " + beverage1.cost() );

        Beverage beverage2 = new Espresso();
        beverage2 = new Milk( beverage2 );

        System.out.println( beverage2.getDescription() + " cost: " + beverage2.cost() );

    }
}
