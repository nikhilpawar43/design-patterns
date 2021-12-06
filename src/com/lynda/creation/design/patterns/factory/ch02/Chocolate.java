package com.lynda.creation.design.patterns.factory.ch02;

import java.util.ArrayList;
import java.util.List;

public class Chocolate extends Candy {
    
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> chocolates = new ArrayList<>();
        
        for (int i=0; i<quantity; i++) {
            chocolates.add(new Chocolate());
        }

        System.out.println(quantity + " chocolates have been packed !");
        return chocolates;
    }
}
