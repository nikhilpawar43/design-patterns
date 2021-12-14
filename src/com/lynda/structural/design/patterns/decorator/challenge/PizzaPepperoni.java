package com.lynda.structural.design.patterns.decorator.challenge;

import java.util.ArrayList;
import java.util.List;

public class PizzaPepperoni implements Pizza {
    
    private String name = "Pepperoni";
    private List<String> toppings = new ArrayList<>();

    public PizzaPepperoni() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("pepperoni");
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
