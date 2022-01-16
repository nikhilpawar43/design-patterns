package com.udemy.patterns.structural.adapter;

public class BusinessCardDesigner {

    public String designCard(Consumer consumer) {
        StringBuilder designBuilder = new StringBuilder();
        designBuilder.append(consumer.getName()).append("\n");
        designBuilder.append(consumer.getDesignation()).append("\n");
        designBuilder.append(consumer.getAddress());

        return designBuilder.toString();
    }
}
