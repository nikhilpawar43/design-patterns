package com.lynda.structural.design.patterns.decorator.challenge;

import java.util.ArrayList;
import java.util.List;

public class PizzaHawaiian implements Pizza {
    
    private String name = "Hawaiian";
    private List<String> toppings = new ArrayList<>();

    public PizzaHawaiian() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("ham");
        toppings.add("pineapple");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getToppings() {
        return toppings;
    }
}
