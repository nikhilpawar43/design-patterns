package com.udemy.patterns.creational.factorymethod.dto.impl;

import com.udemy.patterns.creational.factorymethod.dto.Message;

public class TextMessage extends Message {

    public TextMessage() {
        
    }

    @Override
    public String getContent() {
        return "Text";
    }

    @Override
    public void addDefaultHeaders() {
        System.out.println("Adding content-type header as text/plain");
    }
}
