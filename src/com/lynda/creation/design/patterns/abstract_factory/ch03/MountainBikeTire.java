package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class MountainBikeTire extends Tire {

    private String type = "WIDE";
    private String pressure = "MEDIUM";

    @Override
    public void getDescription() {
        System.out.println("Mountain bike tire type: " + type + ", pressure: " + pressure);
    }
}
