package com.lynda.structural.design.patterns.proxy.challenge;

import java.util.List;
import java.util.Objects;

public class SuperStoreInventoryProxy implements Inventory {
    
    private Inventory inventory;

    public SuperStoreInventoryProxy() {
        
    }
    
    @Override
    public List<Item> getInventory() {
        if (Objects.isNull(inventory)) {
            inventory = new SuperStoreInventory();
        }
        return inventory.getInventory();
    }
}
