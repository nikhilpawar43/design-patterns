package com.lynda.creation.design.patterns.factory.ch04;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class CandyFactory {

    public abstract Candy getCandy(String type);
    
    public List<Candy> getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        
        if (Objects.nonNull(candy)) {
            return candy.makeCandyPackage(quantity);
        }
        
        return Collections.emptyList();
    }
    
}
