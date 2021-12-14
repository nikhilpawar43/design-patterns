package com.lynda.structural.design.patterns.decorator.challenge;

import java.util.ArrayList;
import java.util.List;

public class PizzaMargherita implements Pizza {
    
    private String name = "Margherita";
    private List<String> toppings = new ArrayList<>();

    public PizzaMargherita() {
        toppings.add("cheese");
        toppings.add("tomato");
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
