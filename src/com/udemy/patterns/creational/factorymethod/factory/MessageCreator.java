package com.udemy.patterns.creational.factorymethod.factory;

import com.udemy.patterns.creational.factorymethod.dto.Message;

public abstract class MessageCreator {
    
    public Message getMessage() {
        Message message = createMessage();
 
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }
    
    // Factory method
    protected abstract Message createMessage();
}
