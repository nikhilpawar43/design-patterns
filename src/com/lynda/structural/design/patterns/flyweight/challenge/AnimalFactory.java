package com.lynda.structural.design.patterns.flyweight.challenge;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {
    
    private Map<Integer, Animal> animalMap = new HashMap<>();
    
    public Animal getAnimal(int type) {
        Animal animal;
        
        if (animalMap.containsKey(type)) {
            animal = animalMap.get(type);
        } else {
            if (type == 0) {
                animal = new Lion();
            } else {
                animal = new Tiger();
            }
            animalMap.put(type, animal);
        }
        return animal;
    }
}
