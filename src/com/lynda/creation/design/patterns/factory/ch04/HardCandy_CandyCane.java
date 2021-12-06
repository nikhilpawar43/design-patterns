package com.lynda.creation.design.patterns.factory.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HardCandy_CandyCane extends Candy {

    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> candies = new ArrayList<>();

        if (quantity % 10 != 0) {
            System.out.println("Hard candy must be packed in multiples of 10 !");
            return Collections.emptyList();
        }

        for (int i=0; i<quantity; i++) {
            candies.add(new HardCandy_CandyCane());
        }

        System.out.println((quantity/10) + " package of 10 candy cane have been made");
        return candies;
    }
}
