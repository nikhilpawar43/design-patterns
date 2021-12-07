package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class MountainBikeFactory extends BikeFactory {
    
    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    public HandleBar createHandle() {
        return new MountainBikeHandleBar();
    }
}
