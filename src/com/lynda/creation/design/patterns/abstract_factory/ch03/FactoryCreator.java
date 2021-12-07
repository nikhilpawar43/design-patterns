package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class FactoryCreator {
    
    public static BikeFactory getBikeFactory(String type) {
        
        switch (type) {
            case "mountain bike":
                return new MountainBikeFactory();
                
            case "road bike":
                return new RoadBikeFactory();
                
            default:
                throw new IllegalArgumentException("Please enter a valid bike type !");
        }
    }
}
