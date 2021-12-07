package com.lynda.structural.design.patterns.adaptor.ch02;

public class CarPriceCalculator implements PriceCalculator {
    
    private String model;
    
    private int age;
    
    private static final int DEFAULT_PRICE = 10000;

    public CarPriceCalculator(String model, int age) {
        this.model = model;
        this.age = age;
    }

    @Override
    public String calculatePrice() {
        
        int price = 0;
        
        switch (model) {
            case "Ford":
                price = 3000;
                break;

            case "BMW":
                price = 5000;
                break;

            case "Audi":
                price = 7000;
                break;

            case "Mercedes":
                price = 9000;
                break;
                
            default:
                price = DEFAULT_PRICE;
        }
        
        return price + "USD";
    }
}
