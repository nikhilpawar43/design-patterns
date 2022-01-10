package com.udemy.patterns.creational.factorymethod.dto.impl;

import com.udemy.patterns.creational.factorymethod.dto.Message;

public class JsonMessage extends Message {

    public JsonMessage() {
        
    }

    @Override
    public String getContent() {
        return "{\"JSON\"}: []";
    }

    @Override
    public void addDefaultHeaders() {
        System.out.println("Adding content-type header as application/json");
    }
}
