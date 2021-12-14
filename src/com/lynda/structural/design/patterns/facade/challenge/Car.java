package com.lynda.structural.design.patterns.facade.challenge;

public class Car {

    public static void main(String[] args) {
        
        CarFacade carFacade = new CarFacade();
        carFacade.drive();
    }
}
