package com.lynda.behavioural.design.patterns.interpreter.challenge;

public class FirstLetterIsCapital implements Expression {
    
    private Expression nextExpression = new RemoveDuplicateWords();

    @Override
    public String interpret(String context) {
        String updatedContext = capitalizeFirstAlphabet(context);
        return nextExpression.interpret(updatedContext);
    }
    
    private String capitalizeFirstAlphabet(String context) {
        return context.substring(0, 1).toUpperCase() + context.substring(1);
    }
}
