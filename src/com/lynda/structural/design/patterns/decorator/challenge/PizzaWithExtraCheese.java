package com.lynda.structural.design.patterns.decorator.challenge;

import java.util.List;

public class PizzaWithExtraCheese implements Pizza {
    
    private Pizza decoratedPizza;

    public PizzaWithExtraCheese(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getName() {
        return decoratedPizza.getName();
    }

    @Override
    public List<String> getToppings() {
        List<String> toppings = decoratedPizza.getToppings();
        toppings.add("extra cheese");
        return toppings;
    }
}
