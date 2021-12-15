package com.lynda.structural.design.patterns.proxy.challenge;

import java.util.ArrayList;
import java.util.List;

public class SuperStoreInventory implements Inventory {
    
    private List<Item> inventory = new ArrayList<>();

    public SuperStoreInventory() {
        inventory.add(new Item("Bread", 1, 30));
        inventory.add(new Item("Butter", 4, 40));
        inventory.add(new Item("Ham", 6, 20));
        inventory.add(new Item("Milk", 2, 10));
        inventory.add(new Item("Eggs", 3, 40));
    }

    @Override
    public List<Item> getInventory() {
        return inventory;
    }
}
