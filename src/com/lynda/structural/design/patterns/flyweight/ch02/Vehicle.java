package com.lynda.structural.design.patterns.flyweight.ch02;

public interface Vehicle {
    
    String getType();
    
    int[] getLocation();
    
    void setLocation(int latitude, int longitude);
}
