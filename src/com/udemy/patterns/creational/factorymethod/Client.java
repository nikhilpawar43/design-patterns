package com.udemy.patterns.creational.factorymethod;

import com.udemy.patterns.creational.factorymethod.dto.Message;
import com.udemy.patterns.creational.factorymethod.factory.MessageCreator;
import com.udemy.patterns.creational.factorymethod.factory.impl.JsonMessageCreator;
import com.udemy.patterns.creational.factorymethod.factory.impl.TestMessageCreator;

public class Client {

    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        
        printMessage(new TestMessageCreator());
    }
    
    private static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message.getContent());
    }
}
