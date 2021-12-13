package com.lynda.structural.design.patterns.bridge.challenge;

public class CheckboxButton implements Button {

    private ButtonSize buttonSize;

    public CheckboxButton(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a checkbox button.");
        buttonSize.setSize();
    }
}
