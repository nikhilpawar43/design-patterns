package com.lynda.structural.design.patterns.flyweight.challenge;

public interface Animal {
    
    String getType();
    
    int[] getLocation();
    
    void setLocation(int latitude, int longitude);
}
