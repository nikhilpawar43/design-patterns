package com.lynda.behavioural.design.patterns.interpreter.challenge;

public class Main {

    public static void main(String[] args) {
        
        String sentence = "this is a a a a sentence";
        
        Expression expression = new FirstLetterIsCapital();
        System.out.println(expression.interpret(sentence));
    }
}
