package com.lynda.structural.design.patterns.flyweight.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PopulationSimulator {
    
    static private List<Animal> animals = new ArrayList<>();
    static AnimalFactory animalFactory = new AnimalFactory();

    public static void main(String[] args) {
        
        Runnable createRandomAnimal = PopulationSimulator::createRandomAnimal;
        Runnable removeAnimal = PopulationSimulator::removeAnimal;

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleWithFixedDelay(createRandomAnimal, 0, 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(removeAnimal, 3, 5, TimeUnit.SECONDS);
    }
    
    private static void createRandomAnimal() {
        Random random = new Random();
        int randomInt = random.nextInt(2);
        Animal animal = animalFactory.getAnimal(randomInt);
        
        animal.setLocation(random.nextInt(1000), random.nextInt(1000));

        System.out.println("Creating " + animal + " of type: " + animal.getType() + " at location: " + animal.getLocation()[0] + ", " + animal.getLocation()[1]);
        
        animals.add(animal);        
    }
    
    private static void removeAnimal() {
        Animal removedAnimal = animals.remove(0);
        System.out.println("Removed " + removedAnimal);
    }
}
