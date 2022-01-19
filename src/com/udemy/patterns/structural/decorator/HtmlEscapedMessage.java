package com.udemy.patterns.structural.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEscapedMessage implements Message {
    
    private Message messageToDecorate;

    public HtmlEscapedMessage(Message messageToDecorate) {
        this.messageToDecorate = messageToDecorate;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(messageToDecorate.getContent());
    }
}
