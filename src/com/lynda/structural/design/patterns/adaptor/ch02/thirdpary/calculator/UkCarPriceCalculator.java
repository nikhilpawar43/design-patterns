package com.lynda.structural.design.patterns.adaptor.ch02.thirdpary.calculator;

public class UkCarPriceCalculator {

    private String model;

    private int age;

    private static final int DEFAULT_PRICE = 10000;

    public UkCarPriceCalculator(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public int getPrice() {

        int price = 0;

        switch (model) {
            case "Ford":
                price = 2500;
                break;

            case "BMW":
                price = 4500;
                break;

            case "Audi":
                price = 6500;
                break;

            case "Mercedes":
                price = 8500;
                break;

            default:
                price = DEFAULT_PRICE;
        }
        
        return price;
    }
}
