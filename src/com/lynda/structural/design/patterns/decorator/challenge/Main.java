package com.lynda.structural.design.patterns.decorator.challenge;

public class Main {

    public static void main(String[] args) {
        order(new PizzaMargherita());
        order(new PizzaWithExtraCheese(new PizzaHawaiian()));
        order(new PizzaPepperoni());
    }

    private static void order(Pizza pizza) {
        System.out.println("You have ordered a " + pizza.getName() + " pizza. The toppings are " + pizza.getToppings());
    }
}
