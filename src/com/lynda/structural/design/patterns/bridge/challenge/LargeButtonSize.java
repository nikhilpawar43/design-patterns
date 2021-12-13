package com.lynda.structural.design.patterns.bridge.challenge;

public class LargeButtonSize implements ButtonSize {
    
    @Override
    public void setSize() {
        System.out.println("Setting large button size");        
    }
}
