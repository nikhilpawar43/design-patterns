package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class RoadBikeFactory extends BikeFactory {
    
    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    public HandleBar createHandle() {
        return new RoadBikeHandleBar();
    }
}
