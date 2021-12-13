package com.lynda.structural.design.patterns.bridge.challenge;

public class Canvas {

    public static void main(String[] args) {
        
        // draw a large radio button
        Button radioButton = new RadioButton(new LargeButtonSize());
        radioButton.draw();

        // draw a medium checkbox button
        Button checkboxButton = new CheckboxButton(new MediumButtonSize());
        checkboxButton.draw();

        // draw a small dropdown button
        Button dropdownButton = new DropdownButton(new SmallButtonSize());
        dropdownButton.draw();
    }
}
