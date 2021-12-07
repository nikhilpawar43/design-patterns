package com.lynda.structural.design.patterns.adaptor.ch02;

public class TruckPriceCalculator implements PriceCalculator {
    
    private int age;
    
    private int mileage;

    private static final int DEFAULT_PRICE = 10000;

    public TruckPriceCalculator(int age, int mileage) {
        this.age = age;
        this.mileage = mileage;
    }

    @Override
    public String calculatePrice() {
        return Math.max(DEFAULT_PRICE - age*100 - mileage/100, 0) + "USD";
    }
}
