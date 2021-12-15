package com.lynda.structural.design.patterns.flyweight.challenge;

public class Lion implements Animal {
    
    private static final String TYPE = "Lion";
    private int[] location = new int[2];
    
    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int[] getLocation() {
        return location;
    }

    @Override
    public void setLocation(int latitude, int longitude) {
        location[0] = latitude;
        location[1] = longitude;
    }
}
