package com.lynda.behavioural.design.patterns.interpreter.challenge;

public class EndsWithAPeriod implements Expression {
    
    private static final char PERIOD = '.';
    
    @Override
    public String interpret(String context) {
        int lastCharacterIndex = context.length() - 1;
        
        if (context.charAt(lastCharacterIndex) != PERIOD) {
            context += PERIOD;
        }
        return context;
    }
}
