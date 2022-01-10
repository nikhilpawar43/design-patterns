package com.udemy.patterns.creational.factorymethod.factory.impl;

import com.udemy.patterns.creational.factorymethod.dto.Message;
import com.udemy.patterns.creational.factorymethod.dto.impl.TextMessage;
import com.udemy.patterns.creational.factorymethod.factory.MessageCreator;

public class TestMessageCreator extends MessageCreator {
    
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
