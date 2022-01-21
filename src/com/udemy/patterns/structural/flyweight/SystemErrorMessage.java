package com.udemy.patterns.structural.flyweight;

public class SystemErrorMessage implements ErrorMessage {
    
    // replace the $errorCode in the message template
    private String messageTemplate;
    
    // append the error code in the help document link
    private String helpDocumentLink;

    public SystemErrorMessage(String messageTemplate, String helpDocumentLink) {
        this.messageTemplate = messageTemplate;
        this.helpDocumentLink = helpDocumentLink;
    }

    @Override
    public String getText(String errorCode) {
        return this.messageTemplate.replace("$errorCode", errorCode) + "\n" + this.helpDocumentLink + errorCode;
    }
}
