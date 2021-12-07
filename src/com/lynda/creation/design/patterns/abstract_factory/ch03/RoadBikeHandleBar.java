package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class RoadBikeHandleBar extends HandleBar {
    
    private String type = "DROP";
    
    @Override
    public void getDescription() {
        System.out.println("Mountain bike tire type: " + type);
    }
}
