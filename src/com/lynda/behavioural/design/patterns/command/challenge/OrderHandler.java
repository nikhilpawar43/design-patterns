package com.lynda.behavioural.design.patterns.command.challenge;

public class OrderHandler {
    
    public void invoke(Command command) {
        command.execute();
    }
}
