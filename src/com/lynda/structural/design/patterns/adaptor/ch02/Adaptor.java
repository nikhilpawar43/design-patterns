package com.lynda.structural.design.patterns.adaptor.ch02;

import com.lynda.structural.design.patterns.adaptor.ch02.thirdpary.calculator.UkCarPriceCalculator;

public class Adaptor implements PriceCalculator {
    
    private UkCarPriceCalculator ukCarPriceCalculator;

    public Adaptor(UkCarPriceCalculator ukCarPriceCalculator) {
        this.ukCarPriceCalculator = ukCarPriceCalculator;
    }

    @Override
    public String calculatePrice() {
        return ukCarPriceCalculator.getPrice() + "GBP";
    }
}
