package com.udemy.patterns.structural.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {
    
    private Message messageToDecorate;

    public Base64EncodedMessage(Message messageToDecorate) {
        this.messageToDecorate = messageToDecorate;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(this.messageToDecorate.getContent().getBytes());
    }
}
