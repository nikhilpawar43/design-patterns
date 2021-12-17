package com.lynda.behavioural.design.patterns.interpreter.challenge;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateWords implements Expression {
    
    private Expression nextExpression = new EndsWithAPeriod();

    @Override
    public String interpret(String context) {
        String updatedContext = getContextWithoutDuplicateWords(context);
        return nextExpression.interpret(updatedContext);
    }
    
    private String getContextWithoutDuplicateWords(String context) {
        String[] words = context.split(" ");

        Map<String, Integer> wordCountMap = removeDuplicatesFromContext(words);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<words.length-1; i++) {
            if (wordCountMap.get(words[i]) == 1) {
                stringBuilder.append(words[i]).append(" ");
            } else {
                int count = wordCountMap.get(words[i]);
                wordCountMap.put(words[i], --count);
            }
        }
        
        // Append last word in the sentence
        stringBuilder.append(words[words.length-1]);
        
        return stringBuilder.toString();
    }
    
    private Map<String, Integer> removeDuplicatesFromContext(String[] words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, ++count);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }
    
}
