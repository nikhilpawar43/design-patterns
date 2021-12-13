package com.lynda.structural.design.patterns.bridge.challenge;

public class RadioButton implements Button {
    
    private ButtonSize buttonSize;

    public RadioButton(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a radio button.");
        buttonSize.setSize();
    }
}
