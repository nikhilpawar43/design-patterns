package com.udemy.patterns.creational.factorymethod.factory.impl;

import com.udemy.patterns.creational.factorymethod.dto.Message;
import com.udemy.patterns.creational.factorymethod.dto.impl.JsonMessage;
import com.udemy.patterns.creational.factorymethod.factory.MessageCreator;

public class JsonMessageCreator extends MessageCreator {
    
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
