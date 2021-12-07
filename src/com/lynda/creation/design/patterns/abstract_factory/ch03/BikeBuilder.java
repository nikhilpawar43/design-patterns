package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class BikeBuilder {

    public static void main(String[] args) {
        
        createBikeWithoutAbstractFactory();

        System.out.println();
        
        createBikeWithAbstractFactory("road bike");
    }

    private static void createBikeWithoutAbstractFactory() {
        // Creating a mountain bike
        Tire frontTire = new MountainBikeTire();
        Tire rearTire = new MountainBikeTire();
        HandleBar handleBar = new MountainBikeHandleBar();
        
        frontTire.getDescription();
        rearTire.getDescription();
        handleBar.getDescription();
    }

    private static void createBikeWithAbstractFactory(String type) {
        BikeFactory bikeFactory = FactoryCreator.getBikeFactory(type);

        Tire frontTire = bikeFactory.createTire();
        Tire rearTire = bikeFactory.createTire();
        HandleBar handleBar = bikeFactory.createHandle();

        frontTire.getDescription();
        rearTire.getDescription();
        handleBar.getDescription();
    }
}
