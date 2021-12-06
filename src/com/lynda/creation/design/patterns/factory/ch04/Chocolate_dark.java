package com.lynda.creation.design.patterns.factory.ch04;

import java.util.ArrayList;
import java.util.List;

public class Chocolate_dark extends Candy {

    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> candies = new ArrayList<>();

        for (int i=0; i<quantity; i++) {
            candies.add(new Chocolate_dark());
        }

        System.out.println("One package for " + quantity + " dark chocolates have been made");
        return candies;
    }
}
