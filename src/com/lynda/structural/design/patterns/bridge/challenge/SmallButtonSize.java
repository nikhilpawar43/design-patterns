package com.lynda.structural.design.patterns.bridge.challenge;

public class SmallButtonSize implements ButtonSize {
    
    @Override
    public void setSize() {
        System.out.println("Setting small button size");
    }
}
