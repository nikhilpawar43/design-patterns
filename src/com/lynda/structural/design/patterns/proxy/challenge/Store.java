package com.lynda.structural.design.patterns.proxy.challenge;

public class Store {
    
    private String name;
    private String location;
    private Inventory inventory;

    public Store(String name, String location, Inventory inventory) {
        this.name = name;
        this.location = location;
        this.inventory = inventory;
    }

    public void printName() {
        System.out.println("Store name: " + name);
    }

    public void printLocation() {
        System.out.println("Store location: " + location);
    }

    public void printInventory() {
        inventory.getInventory().forEach(System.out::println);
    }
}
