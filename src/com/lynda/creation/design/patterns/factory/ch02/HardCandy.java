package com.lynda.creation.design.patterns.factory.ch02;

import java.util.ArrayList;
import java.util.List;

public class HardCandy extends Candy {

    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> hardCandies = new ArrayList<>();
        
        for (int i=0; i<quantity; i++) {
            hardCandies.add(new HardCandy());
        }

        System.out.println(quantity + " hard candies have been packed !");
        return hardCandies;
    }
}
