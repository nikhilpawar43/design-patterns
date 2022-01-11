package com.udemy.patterns.creational.prototype;

public abstract class GameUnit implements Cloneable {
    
    private AttackOrder attackOrder;

    public GameUnit() {
        
    }
    
    public void move(String direction, Long distance) {
        this.attackOrder = new AttackOrder(direction, distance);
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException {
        GameUnit gameUnitClone = (GameUnit) super.clone();
        gameUnitClone.attackOrder = (AttackOrder) attackOrder.clone();
        return gameUnitClone;
    }

    public abstract void attack();

    public AttackOrder getAttackOrder() {
        return attackOrder;
    }
}
