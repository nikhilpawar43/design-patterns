package com.lynda.creation.design.patterns.factory.ch02;

import java.util.List;

public class CandyStore {

    public static void main(String[] args) {
        
        CandyFactory candyFactory = new CandyFactory();
        List<Candy> candies = candyFactory.getCandy(2, "hard candy");

        System.out.println(candies);
    }
    
}
