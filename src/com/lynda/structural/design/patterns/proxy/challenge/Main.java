package com.lynda.structural.design.patterns.proxy.challenge;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new SuperStoreInventoryProxy();
        Store store = new Store("Reliance Fresh", "Kothrud", inventory);
        
        store.printName();
        store.printLocation();
        store.printInventory();
    }
}
