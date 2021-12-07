package com.lynda.structural.design.patterns.adaptor.ch02;

import com.lynda.structural.design.patterns.adaptor.ch02.thirdpary.calculator.UkCarPriceCalculator;

public class Main {

    public static void main(String[] args) {
        
        PriceCalculator carPriceCalulator = new CarPriceCalculator("BMW", 3);
        PriceCalculator truckPriceCalulator = new TruckPriceCalculator(1, 3);
        
        printVehiclePrice(carPriceCalulator);
        printVehiclePrice(truckPriceCalulator);

        UkCarPriceCalculator ukCarPriceCalculator = new UkCarPriceCalculator("Audi", 2);
        Adaptor adaptor = new Adaptor(ukCarPriceCalculator);
        
        printVehiclePrice(adaptor);
    }

    private static void printVehiclePrice(PriceCalculator priceCalculator) {
        String price = priceCalculator.calculatePrice();
        System.out.println("The price of vehicle is: " + price);
    }
}
