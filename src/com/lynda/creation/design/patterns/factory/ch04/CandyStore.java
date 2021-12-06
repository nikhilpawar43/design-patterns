package com.lynda.creation.design.patterns.factory.ch04;

public class CandyStore {

    public static void main(String[] args) {
        
        CandyFactory chocolateFactory = new ChocolateFactory();
        CandyFactory hardCandyFactory = new HardCandyFactory();
        
        chocolateFactory.getCandyPackage(7, "dark");
        hardCandyFactory.getCandyPackage(14, "lollipop");
        hardCandyFactory.getCandyPackage(50, "peppermint");
    }
}
