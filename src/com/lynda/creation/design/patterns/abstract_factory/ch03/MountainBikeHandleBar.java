package com.lynda.creation.design.patterns.abstract_factory.ch03;

public class MountainBikeHandleBar extends HandleBar {
    
    private String type = "FLAT";
    
    @Override
    public void getDescription() {
        System.out.println("Mountain bike tire type: " + type);
    }
}
