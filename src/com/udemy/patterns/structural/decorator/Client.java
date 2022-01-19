package com.udemy.patterns.structural.decorator;

public class Client {

    public static void main(String[] args) {
        
        Message textMessage = new TextMessage("This message is in full <FORCE>");
        System.out.println(textMessage.getContent());
        
        Message htmlEscapedMessage = new HtmlEscapedMessage(textMessage);
        System.out.println(htmlEscapedMessage.getContent());
        
        Message base64EncodedMessage = new Base64EncodedMessage(htmlEscapedMessage);
        System.out.println(base64EncodedMessage.getContent());
    }
}
