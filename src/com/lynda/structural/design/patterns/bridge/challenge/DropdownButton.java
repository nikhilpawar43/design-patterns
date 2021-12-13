package com.lynda.structural.design.patterns.bridge.challenge;

public class DropdownButton implements Button {

    private ButtonSize buttonSize;

    public DropdownButton(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a drop down button.");
        buttonSize.setSize();
    }
}
