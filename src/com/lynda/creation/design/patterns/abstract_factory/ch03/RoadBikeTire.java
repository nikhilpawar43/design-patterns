package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class RoadBikeTire extends Tire {
    
    private String type = "NARROW";
    private String pressure = "HIGH";

    @Override
    public void getDescription() {
        System.out.println("Road bike tire type: " + type + ", pressure: " + pressure);
    }
}
