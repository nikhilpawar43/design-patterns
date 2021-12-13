package com.lynda.structural.design.patterns.bridge.challenge;

public class MediumButtonSize implements ButtonSize {
    
    @Override
    public void setSize() {
        System.out.println("Setting medium button size");        
    }
}
