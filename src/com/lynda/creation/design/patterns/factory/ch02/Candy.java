package com.lynda.creation.design.patterns.factory.ch02;

import java.util.List;

public abstract class Candy {
    
    abstract List<Candy> makeCandyPackage(int quantity);
}
