package com.lynda.behavioural.design.patterns.command.ch02;

public class Button {
    
    private String text;

    public Button(String text) {
        this.text = text;
    }
    
    public void click(Command command) {
        command.execute();
    }
}
