package com.lynda.structural.design.patterns.flyweight.ch02;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    
    Map<Integer, Vehicle> vehicleMap = new HashMap<>();
    
    public Vehicle getVehicle(int type) {
        Vehicle vehicle = null;
        
        if (vehicleMap.containsKey(type)) {
            vehicle = vehicleMap.get(type);
        } else {
            if (type == 0) {
                vehicle = new Car();
            } else {
                vehicle = new Truck();
            }
        }
        vehicleMap.put(type, vehicle);
        return vehicle;
    }
}
