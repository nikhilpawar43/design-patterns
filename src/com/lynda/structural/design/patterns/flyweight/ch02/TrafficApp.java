package com.lynda.structural.design.patterns.flyweight.ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficApp {
    
    static List<Vehicle> vehicles = new ArrayList<>();
    static VehicleFactory vehicleFactory = new VehicleFactory();

    public static void main(String[] args) {
        Runnable createVehicleRunnable = TrafficApp::createRandomVehicle;
        Runnable removeVehicleRunnable = TrafficApp::removeVehicle;

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleWithFixedDelay(createVehicleRunnable, 0, 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(removeVehicleRunnable, 3, 5, TimeUnit.SECONDS);
    }
    
    private static void createRandomVehicle() {
        Random random = new Random();
        Vehicle vehicle = vehicleFactory.getVehicle(random.nextInt(2));
        
        vehicle.setLocation(random.nextInt(1000), random.nextInt(1000));
        
        System.out.println("Creating " + vehicle + " of type: " + vehicle.getType() + " at location: " + vehicle.getLocation()[0] + ", " + vehicle.getLocation()[1]);
        vehicles.add(vehicle);
    }
    
    private static void removeVehicle() {
        Vehicle removedVehicle = vehicles.remove(0);
        System.out.println("Removed " + removedVehicle);
    }
}
